import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class FlashSaleInventoryManager{

    private final ConcurrentHashMap<String, AtomicInteger> stock = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, ConcurrentLinkedQueue<Integer>> waiting = new ConcurrentHashMap<>();

    public void addProduct(String id, int qty) {
        stock.put(id, new AtomicInteger(qty));
        waiting.put(id, new ConcurrentLinkedQueue<>());
    }

    public int checkStock(String id) {
        return stock.get(id).get();
    }

    public String purchaseItem(String id, int userId) {
        AtomicInteger s = stock.get(id);

        while (true) {
            int current = s.get();
            if (current <= 0) {
                waiting.get(id).add(userId);
                return "Added to waiting list";
            }
            if (s.compareAndSet(current, current - 1)) return "Success";
        }
    }
}
