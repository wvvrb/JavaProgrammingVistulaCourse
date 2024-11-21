import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner myObject = new Scanner(System.in);

        System.out.println("Please enter two numbers:");

        //variable declaration and initialization based on user input
        float firstNumber = myObject.nextFloat();
        float secondNumber = myObject.nextFloat();

        //calculations
        float additionResult = firstNumber + secondNumber;
        float subtractionResult = firstNumber - secondNumber;
        float multiplicationResult = firstNumber * secondNumber;
        float divisionResult = firstNumber / secondNumber;

        System.out.println("Here is the results of the calculations: ");
        System.out.println("Addition = " + format(additionResult));
        System.out.println("Subtraction = " + format(subtractionResult));
        System.out.println("Multiplication = " + format(multiplicationResult));
        System.out.println("Division = " + format(divisionResult));
    }

    //method that sets the result number format to 2 decimal places
    private static String format(float number) {
        return String.format("%.2f", number);

    }
}
