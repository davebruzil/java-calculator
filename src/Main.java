import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Calculator!");
        System.out.println("Operations:");
        System.out.println("1. Addition (Plus)");
        System.out.println("2. Subtraction (Minus)");
        System.out.println("3. Multiplication (Mul)");
        System.out.println("4. Division (Div)");
        System.out.println("5. Exit");

        while (running) {
            System.out.print("\nChoose an operation (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Addition (Plus)
                    System.out.print("Enter first number: ");
                    double add1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double add2 = scanner.nextDouble();
                    Expression addition = new Plus(new Number(add1), new Number(add2));
                    System.out.println("Result: " + addition.calculate());
                    break;

                case 2: // Subtraction (Minus)
                    System.out.print("Enter first number: ");
                    double sub1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double sub2 = scanner.nextDouble();
                    Expression subtraction = new Minus(new Number(sub1), new Number(sub2));
                    System.out.println("Result: " + subtraction.calculate());
                    break;

                case 3: // Multiplication (Mul)
                    System.out.print("Enter first number: ");
                    double mul1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double mul2 = scanner.nextDouble();
                    Expression multiplication = new Mul(new Number(mul1), new Number(mul2));
                    System.out.println("Result: " + multiplication.calculate());
                    break;

                case 4: // Division (Div)
                    System.out.print("Enter first number: ");
                    double div1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double div2 = scanner.nextDouble();
                    if (div2 == 0) {
                        System.out.println("Error: Division by zero is undefined.");
                    } else {
                        Expression division = new Div(new Number(div1), new Number(div2));
                        System.out.println("Result: " + division.calculate());
                    }
                    break;

                case 5: // Exit
                    running = false;
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
            }
        }

        scanner.close();
    }
}

