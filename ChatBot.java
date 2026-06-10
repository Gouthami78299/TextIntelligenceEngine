public class ChatBot {

    public static String reply(String input) {
        input = input.toLowerCase();

        if (input.contains("sad") || input.contains("depressed")) {
            return "I'm here for you. Stay strong 💛";
        } 
        else if (input.contains("happy")) {
            return "That's wonderful to hear 😄";
        } 
        else if (input.contains("hello")) {
            return "Hi! How can I help you?";
        }

        return "Interesting... tell me more!";
    }
}