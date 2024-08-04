import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Input second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Input operation
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Result variable
            double result;

            // Perform calculation based on operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator. Please use +, -, *, or /.");
            }

            // Print the result
            System.out.printf("Result: %.2f%n", result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers and operator.");
        } finally {
            scanner.close();
        }
    }
}
