import java.util.*;


    public class Calculator {
    public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);
    double firstnum = 0;
    double secondnum = 0;
    int operation = 0;
    double result = 0;

        System.out.print("Enter first operand:");
        firstnum = keyboard.nextDouble();

        System.out.print("Enter second operand:");
        secondnum = keyboard.nextDouble();

        System.out.print("Calculator Menu\n---------------\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n");

        System.out.print("Which operation do you want to perform? ");
        operation = keyboard.nextInt();

        if (operation == 1) {
            result = firstnum + secondnum;
            System.out.print("The result of the operation is " + result + ". Goodbye!");
        }
        else
            if (operation == 2) {
                result = firstnum - secondnum;
                System.out.print("The result of the operation is " + result + ". Goodbye!");
            }
            else
                if (operation == 3) {
                    result = firstnum * secondnum;
                    System.out.print("The result of the operation is " + result + ". Goodbye!");
                }
                else
                    if (operation == 4) {
                        result = firstnum / secondnum;
                        System.out.print("The result of the operation is " + result + ". Goodbye!");
                    }
                    else
                        System.out.print("Error: Invalid selection! Terminating program.");

    }


}
