import java.util.Scanner;

public class calculateThat {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two numbers
    System.out.print("Enter two numbers: ");
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();

    // Prompt the user to enter an operator
    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = input.next().charAt(0);

    double result;

    // Compute the result based on the operator
    switch (operator) {
      case '+':
        result = number1 + number2;
        break;
      case '-':
        result = number1 - number2;
        break;
      case '*':
        result = number1 * number2;
        break;
      case '/':
        result = number1 / number2;
        break;
      default:
        System.out.println("Invalid operator!");
        return;
    }

    // Display the result
    System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
  }
}
