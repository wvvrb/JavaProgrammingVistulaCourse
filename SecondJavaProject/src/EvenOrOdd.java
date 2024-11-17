public class EvenOrOdd {
    public static void main(String[] args) {

        //generating random number ranging from 1 to 100
        int randomNum = (int)(Math.random() * 101);

        //checking if the number is even or odd
        if ((randomNum % 2) == 0)
        {
            System.out.println(randomNum + " is an even number");
        }
        else
        {
            System.out.println(randomNum + " is an odd number");
        }
    }
}
