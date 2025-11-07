import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        //Scanner class used to handle recuppering the input values 
        //creating a Scanner object 
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        
        System.out.println("Please enter the first number: ");
        num1 = scanner.nextDouble();
        
        System.out.println("Please enter an operator (+,-,/,*,^,%): ");
        operator = scanner.next().charAt(0);

        System.out.println("Please enter the second number: ");
        num2 = scanner.nextDouble();

        result = switch(operator)
        {
            case '+' -> num1 + num2;
            case '-'-> num1 - num2;
            case '/' -> {
                if (num2 == 0)
                {
                    System.out.println("we can't divide by zero!!!");
                    yield Double.NaN;
                }   
                else 
                    yield num1 / num2;
                }
            
            case '*' ->  num1 * num2;
            case '%' ->  num1 % num2;
            case '^' ->  Math.pow(num1, num2);
            default -> {
                System.out.println("Enter a valid operator");
                yield Double.NaN;
                }
        };

        System.out.println(result);

        scanner.close();
    }
} 