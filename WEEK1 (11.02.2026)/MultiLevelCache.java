import java.util.*;

public class MultiLevelCache{

    private final LinkedHashMap<String, String> l1 = new LinkedHashMap<>(16, 0.75f, true) {
        protected boolean removeEldestEntry(Map.Entry<String, String> e) {
            return size() > 10000;
        }
    };

    private final HashMap<String, String> l2 = new HashMap<>();
    private final HashMap<String, String> db = new HashMap<>();

    public String get(String id) {
        if (l1.containsKey(id)) return l1.get(id);

        if (l2.containsKey(id)) {
            l1.put(id, l2.get(id));
            return l2.get(id);
        }

        String data = db.getOrDefault(id, "videoData");
        l2.put(id, data);
        return data;
    }
}
