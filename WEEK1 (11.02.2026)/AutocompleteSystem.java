import java.util.*;

class TrieNode{
    Map<Character, TrieNode> child = new HashMap<>();
    Map<String, Integer> words = new HashMap<>();
}

public class AutocompleteSystem {

    private final TrieNode root = new TrieNode();

    public void insert(String query) {
        TrieNode node = root;
        for (char c : query.toCharArray()) {
            node = node.child.computeIfAbsent(c, k -> new TrieNode());
            node.words.merge(query, 1, Integer::sum);
        }
    }

    public List<String> suggest(String prefix) {
        TrieNode node = root;

        for (char c : prefix.toCharArray()) {
            node = node.child.get(c);
            if (node == null) return List.of();
        }

        return node.words.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(10)
                .map(Map.Entry::getKey)
                .toList();
    }
}
