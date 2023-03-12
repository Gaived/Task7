import java.util.*;

public class WordsChecker {

    private final Set<String> words;

    public WordsChecker(String text) {
        this.words = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        return words.contains(word);
    }
}
