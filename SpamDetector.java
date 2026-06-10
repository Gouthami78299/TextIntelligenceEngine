public class SpamDetector {

    public static boolean isSpam(String text) {
        text = text.toLowerCase();

        return text.contains("win money") ||
               text.contains("free offer") ||
               text.matches(".*\\$\\d+.*");
    }
}