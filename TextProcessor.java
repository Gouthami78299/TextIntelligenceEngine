public class TextProcessor {

    public static String cleanText(String text) {
        return text.replaceAll("[^a-zA-Z ]", "")
                   .toLowerCase()
                   .trim();
    }
}