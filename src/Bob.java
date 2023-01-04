import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        {

            System.out.println("Please enter a question for Bob: ");
            String userInput = scanner.nextLine(); userInput.endsWith("?");
            System.out.println("Sure");


            System.out.println("Please enter something that will be said while yelling");
            String userInput1 = scanner.nextLine(); userInput.endsWith("!");
            System.out.println("Whoa, chill out!");


            System.out.println("Please Say Bob's name and follow with nothing");
            String userInput2 = scanner.nextLine(); userInput.endsWith(" ");
            System.out.println("Fine, Be that way!");


            System.out.println("Say whatever is on your mind to Bob");
            String userInput3 = scanner.nextLine(); userInput.endsWith(" ");
            System.out.println("Whatever");
        }

    }
}
