import java.util.*;

public class SentimentAnalyzer {

    static List<String> positive = Arrays.asList("good", "happy", "great", "love", "excellent");
    static List<String> negative = Arrays.asList("bad", "sad", "angry", "hate", "worst");

    public static String analyze(String text) {
        text = text.toLowerCase();

        int score = 0;

        for (String word : positive) {
            if (text.contains(word)) score++;
        }

        for (String word : negative) {
            if (text.contains(word)) score--;
        }

        if (score > 0) return "Positive 😊";
        else if (score < 0) return "Negative 😡";
        else return "Neutral 😐";
    }
}