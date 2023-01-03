import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi approximately %.2f.", pi);
        System.out.format("%nThe value of pi approximately %.2f. .%n", pi);
       // Explore the Scanner Class

 //Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        Scanner scanner = new Scanner(System.in);

        {
            int integer;

            System.out.println("Enter an integer: ");
            int number = scanner.nextInt();

            System.out.println("You entered: --> \" " + number + " \" <--");

        }

        // If anything else other than an integer is entered, an error will occur in the console.
//
//
//        // Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.


        System.out.println("Enter 3 colors: ");
        String inputOne = "firstColor";
        String nextInput = "secondColor";
        String lastInput = "thirdColor";
        String userInput1=scanner.next();
        String userInput2=scanner.next();
        String userInput3=scanner.next();

        System.out.println("You entered: --> \""+ userInput1 +userInput2 + userInput3 +"\" <--");

    }



    }

