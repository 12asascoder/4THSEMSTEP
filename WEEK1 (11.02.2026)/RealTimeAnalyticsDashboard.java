import java.util.*;
import java.util.concurrent.*;

public class RealTimeAnalyticsDashboard{

    private final ConcurrentHashMap<String, Integer> views = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Set<String>> unique = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Integer> source = new ConcurrentHashMap<>();

    public void process(String url, String user, String src) {
        views.merge(url, 1, Integer::sum);
        unique.computeIfAbsent(url, k -> ConcurrentHashMap.newKeySet()).add(user);
        source.merge(src, 1, Integer::sum);
    }

    public List<String> topPages() {
        return views.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(10)
                .map(Map.Entry::getKey)
                .toList();
    }
}
