import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Select operation: +, -, *, / or type 'exit' to quit:");
            choice = sc.nextLine();

            if (choice.equals("exit")) {
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            sc.nextLine(); // Consume the newline character

            double result;
            switch (choice) {
                case "+":
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case "/":
                    try {
                        result = divide(num1, num2);
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
            }
        } while (true);

        sc.close();
        System.out.println("Calculator exited.");
    }
}