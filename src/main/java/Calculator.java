import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Selection an operation: ");
        System.out.println("1. Addition(+)");
        System.out.println("2. Subtraction(-)");
        System.out.println("3. Multiplication(*)");
        System.out.println("4. Division(/)");

        System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            double result = 0.0;
            String operator = "";

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    operator = "+";
                    break;
                case 2:
                    result = num1 - num2;
                    operator = "-";
                    break;
                case 3:
                    result = num1 * num2;
                    operator = "*";
                    break;
                case 4:
                    result = num1 / num2;
                    operator = "/";
                    break;
                default:
                    System.out.println("Invalid choice.");
                        return;
            }
        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
            scanner.close();
    }
}
