import java.util.*;
import java.util.concurrent.*;

public class UsernameAvailabilityChecker{

    private final ConcurrentHashMap<String, Integer> users = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Integer> attempts = new ConcurrentHashMap<>();

    public boolean checkAvailability(String username) {
        attempts.merge(username, 1, Integer::sum);
        return !users.containsKey(username);
    }

    public void register(String username, int userId) {
        users.putIfAbsent(username, userId);
    }

    public List<String> suggestAlternatives(String username) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= 5; i++) res.add(username + i);
        res.add(username.replace("_", "."));
        return res;
    }

    public String getMostAttempted() {
        return attempts.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");
    }
}
