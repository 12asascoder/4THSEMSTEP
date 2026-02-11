import java.util.concurrent.*;

public class RateLimiter{

    static class Bucket {
        int tokens = 1000;
        long last = System.currentTimeMillis();
    }

    private final ConcurrentHashMap<String, Bucket> map = new ConcurrentHashMap<>();

    public boolean allow(String client) {
        Bucket b = map.computeIfAbsent(client, k -> new Bucket());
        long now = System.currentTimeMillis();

        if (now - b.last > 3600000) {
            b.tokens = 1000;
            b.last = now;
        }

        if (b.tokens > 0) {
            b.tokens--;
            return true;
        }

        return false;
    }
}
