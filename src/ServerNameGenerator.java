public class ServerNameGenerator {

    String [] adjectives = {"adorable","adventurous","aggressive",
            "amused","angry","annoyed","anxious","arrogant","awful","beautiful"};

    String [] nouns = {"city","New York","banana",
            "family","ice cream","annoyed","table","Germany","Cuba","Florida"};

    public String returnOne() {
        return String.format("Return one or the other %s %s!", adjectives, nouns);
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name anxious-Germany");
    }
}
