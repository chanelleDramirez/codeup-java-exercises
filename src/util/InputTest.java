package util;

import java.util.Scanner;

public class InputTest {
    private Scanner scanner;
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString());
    }
    public InputTest() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String response = scanner.nextLine();
        if (response.equals("yes") || response.equals("y")) {
            return true;
        } else {
            return false;
        }
    }
    public int getInt(int min, int max) {
        int response = scanner.nextInt();
        if(response <= max && response >= min ){
            return response;
        }else{

            return getInt(min,max);
        }


    }
    public double getDouble(double min, double max){
        double response = scanner.nextDouble();
        if(response <= max && response >= min ){
            return response;
        }else {

            return getDouble(min, max);
        }
    }
    public int getInt(){
        return scanner.nextInt();
    }

    public double getDouble(){
        return scanner.nextDouble();
    }

}

