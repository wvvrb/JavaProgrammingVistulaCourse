import java.util.Scanner;
import java.lang.Math;
public class BmiCalc {
    public static void main(String[] args){
        Scanner myObject = new Scanner(System.in);

        //variable declaration and initialization based on user input
        System.out.println("Please, enter your weight in kilograms:");
        float userWeight = myObject.nextFloat();

        //variable declaration and initialization based on user input
        System.out.println("Please, enter your height in metres:");
        float userHeight = myObject.nextFloat();

        //calculating BMI and displaying it rounded to two decimal places
        double userBmi = userWeight / Math.pow(userHeight, 2);
        System.out.println("Your BMI is " + String.format("%.2f", userBmi));

        //displaying the BMI description according to the result
        if (userBmi < 16.00) {
            System.out.println("That indicates severe thinness.");
        }
        else if ((userBmi >= 16)&&(userBmi < 16.99)) {
            System.out.println("That indicates moderate thinness.");
        }
        else if ((userBmi >= 17)&&(userBmi < 18.49)) {
            System.out.println("That indicates mild thinness.");
        }
        else if ((userBmi >= 18.50)&&(userBmi < 22.99)) {
            System.out.println("That indicates low range of norm.");
        }
        else if ((userBmi >= 23)&&(userBmi < 24.99)) {
            System.out.println("This indicates high range of norm.");
        }
        else if ((userBmi >= 25)&&(userBmi < 27.49)) {
            System.out.println("That indicates low range of overweight.");
        }
        else if ((userBmi >= 27.50)&&(userBmi < 29.99)) {
            System.out.println("That indicates high range of overweight.");
        }
        else if ((userBmi >= 30)&&(userBmi < 34.9)) {
            System.out.println("That indicates class I obese.");
        }
        else if ((userBmi >= 35)&&(userBmi < 39.9)) {
            System.out.println("That indicates class II obese.");
        }
        else if (userBmi >= 40) {
            System.out.println("That indicates class III obese.");
        }
    }
}
