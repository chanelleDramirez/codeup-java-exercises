public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(3,4));
        System.out.println(subtraction(26,13));
        System.out.println(multiplication(7,6));
        System.out.println(division(15,3));
    }
    // Create four separate methods. Each will perform an arithmetic operation:

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int r, int t) {
        return r - t;
    }

    public static int multiplication(int d, int a) {
        return d * a;
    }

    public static int division(int e, int b) {
        return e / b;
    }
}
