public class marsWeightCalculator {
    public static void main(String[] args){
        float earthWeight = 60;
        float marsWeight;
        double marsWeightDouble;
        int marsWeightInt;

        //calculating the value of my weight on Mars
        marsWeight = earthWeight*0.38f;
        System.out.println("My weight on Mars is " + marsWeight + " kg");

        //converting the value of my weight on Mars (22.8) to double variable
        marsWeightDouble = marsWeight;
        System.out.printf("My weight on Mars converted to double is " + String.format("%.4f", marsWeightDouble) + " kg");

        //converting the value of my weight on Mars (22,8000) to int variable
        marsWeightInt = (int)marsWeightDouble;
        System.out.println("\nMy weight on Mars converted to int is " + marsWeightInt + " kg");

        //converting the value of my weight on Mars (22) to char variable
        //adding 48 (0 in unicode) because 22 is an control character in ASCII, so the terminal would show empty box
        char marsWeightChar = (char)(marsWeightInt + 48);
        System.out.println("My weight on Mars converted to char is " + marsWeightChar);

        //calculating an example math operation on char variables and showing result on an int variable
        int exampleMathOperation = marsWeightChar * marsWeightChar;
        System.out.println("Result of an example math operation on a char variable is " + exampleMathOperation);
    }
}
