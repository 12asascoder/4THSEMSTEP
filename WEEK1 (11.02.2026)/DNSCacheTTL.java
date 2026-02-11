import java.util.*;

public class DNSCacheTTL{

    static class Entry {
        String ip;
        long expiry;
        Entry(String ip, long ttl) {
            this.ip = ip;
            this.expiry = System.currentTimeMillis() + ttl;
        }
    }

    private final Map<String, Entry> cache = new LinkedHashMap<>(16, 0.75f, true) {
        protected boolean removeEldestEntry(Map.Entry<String, Entry> e) {
            return size() > 1000;
        }
    };

    public String resolve(String domain) {
        Entry e = cache.get(domain);

        if (e != null && e.expiry > System.currentTimeMillis())
            return e.ip;

        String ip = "192.168.0." + new Random().nextInt(255);
        cache.put(domain, new Entry(ip, 5000));
        return ip;
    }
}
