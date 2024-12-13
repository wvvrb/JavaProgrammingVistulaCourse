import java.util.Random;

public class GreatestSmallestNumber {
    public static void main(String[] args) {
        Random random = new Random();

        //initialization of variables needed for the loop
        //setting the greatest number as 0, and the smallest as 101 to mach the desired range of numbers
        //this will change with every iteration
        int numbers = 0;
        int max = 0;
        int min = 101;

        //generating and displaying 10 random numbers from 0 to 100 with every iteration
        while (numbers < 10) {
            int randomNum = random.nextInt(101);
            System.out.println(randomNum);
            numbers++;

            //checking with every iteration if current number is greater than previous greatest number
            //if yes: updating current greatest number
            if (max < randomNum) {
                max = randomNum;
            }

            //checking with every iteration if current number is smaller than previous smallest number
            //if yes: updating current smallest number
            if (min > randomNum) {
                min = randomNum;
            }
        }

        //displaying results
        System.out.println("The greatest number is: " + max);
        System.out.println("The smallest number is: " + min);
    }
}
