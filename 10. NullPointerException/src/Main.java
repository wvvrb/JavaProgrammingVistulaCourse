//creating main class to execute the program
public class Main {
    public static void main(String[] args) {
        //creating an instance of ExceptionGenerator
        ExceptionGenerator generator = new ExceptionGenerator();

        try {
            //calling the method that generates the exception
            generator.generateNullPointerException();
        } catch (NullPointerException e) {
            //displaying a message when the exception occurs
            System.out.println("Oops! A NullPointerException occurred. Check your code!");

            //printing the stack trace for debugging purposes
            e.printStackTrace();

            //displaying a short description of the exception
            System.out.println(e.toString());
        }
    }
}

//creating a class with a method that generates a NullPointerException
class ExceptionGenerator {
    public void generateNullPointerException() {
        //creating a variable with a null value
        String str = null;

        //trying to call the length() method on the null variable
        //this will generate a NullPointerException
        System.out.println(str.length());
    }
}
