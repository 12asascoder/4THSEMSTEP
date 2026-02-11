import java.util.*;

public class TransactionAnalyzer{

    static class Tx {
        int id, amount;
        Tx(int i, int a) { id = i; amount = a; }
    }

    public List<int[]> twoSum(List<Tx> txs, int target) {
        Map<Integer, Tx> map = new HashMap<>();
        List<int[]> res = new ArrayList<>();

        for (Tx t : txs) {
            if (map.containsKey(target - t.amount))
                res.add(new int[]{map.get(target - t.amount).id, t.id});
            map.put(t.amount, t);
        }

        return res;
    }
}
