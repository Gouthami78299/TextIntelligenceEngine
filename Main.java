import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String input = sc.nextLine();

        String cleaned = TextProcessor.cleanText(input);

        System.out.println("Cleaned Text: " + cleaned);

        System.out.println("Sentiment: " + 
            SentimentAnalyzer.analyze(cleaned));

        System.out.println("Bot Reply: " + 
            ChatBot.reply(cleaned));

        System.out.println("Spam: " + 
            SpamDetector.isSpam(cleaned));
    }
}