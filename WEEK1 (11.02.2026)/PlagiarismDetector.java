import java.util.*;

public class PlagiarismDetector{

    private final Map<String, Set<Integer>> index = new HashMap<>();

    public void addDocument(int id, String text, int n) {
        String[] words = text.split("\\s+");

        for (int i = 0; i <= words.length - n; i++) {
            String gram = String.join(" ", Arrays.copyOfRange(words, i, i + n));
            index.computeIfAbsent(gram, k -> new HashSet<>()).add(id);
        }
    }

    public double similarity(String text, int id, int n) {
        String[] words = text.split("\\s+");

        int match = 0, total = 0;

        for (int i = 0; i <= words.length - n; i++) {
            total++;
            String gram = String.join(" ", Arrays.copyOfRange(words, i, i + n));
            if (index.getOrDefault(gram, Collections.emptySet()).contains(id))
                match++;
        }

        return (match * 100.0) / total;
    }
}
