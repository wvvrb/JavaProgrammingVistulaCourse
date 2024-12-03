public class AdditionEven {
    public static void main(String[] args){

        //setting the initial sum value to 0
        int sum = 0;

        //starting from 0 and increments by 2 on each iteration
        //this ensures that the loop processes only even numbers
        for (int i = 0; i <=100; i = i +2) {
            sum += i;   //sum = addition of subsequent even numbers from a loop
        }
        System.out.println("The sum of even numbers from 1 to 100 is " + sum);
    }
}
