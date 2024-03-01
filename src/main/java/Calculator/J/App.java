package Calculator.J;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    //

    public static void main(String[] args) {
        System.out.println("My new calculating App");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a valid Operation:");
        int operationType = scanner.nextInt();

        if (operationType == 1) {
            int additionResult = addition();
            System.out.println("additionResult = " + additionResult);
        } else if (operationType == 2) {

        }

    }

    //
    public static int addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter a number:");
        int number2 = scanner.nextInt();

        int result = number1 + number2;
        return result;

        public static int substraction() {
            Scanner scanner = new Scanner(System.in)
            System.out.println("Enter a number:");
            int number1 = scanner.nextInt();
            System.out.println("Enter a number:");
            int number2 = scanner.nextInt();

            int result = number1 - number2;
            return result;

            public static int multiplication() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a number:");
                int number1 = scanner.nextInt();
                System.out.println("Enter a number:");
                int number2 = scanner.nextInt();

                int result = number1 * number2;
                return result;

                public static int division() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter a number:");
                    int number1 = scanner.nextInt();
                    System.out.println("Enter a number:");
                    int number2 = scanner.nextInt();

                    int result = number1 / number2;
                    return result;
    }

    // todo: define other methods


}
