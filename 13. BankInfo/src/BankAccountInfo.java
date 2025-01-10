import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class BankAccountInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt user to enter the first three digits of their account number
        System.out.println("Please enter the first three digits of your account number:");
        String userInput = scanner.nextLine();

        //validate input to ensure it is exactly 3 digits
        if (userInput.length() != 3 || !userInput.matches("\\d{3}")) {
            System.out.println("Invalid input. Please enter exactly three numeric digits.");
            return;
        }

        //URL of the file to fetch data from
        String fileUrl = "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt";

        try {
            //open connection to the URL
            HttpURLConnection connection = (HttpURLConnection) new URL(fileUrl).openConnection();
            connection.setRequestMethod("GET");

            //check if the connection was successful
            if (connection.getResponseCode() != 200) {
                System.out.println("Failed to fetch data from the server. Please try again later.");
                return;
            }

            //read data from the file line by line
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            boolean found = false;

            //search for the bank corresponding to the entered digits
            while ((line = reader.readLine()) != null) {
                //normalize the line by replacing multiple spaces/tabs with a single space
                line = line.replaceAll("\\s+", " ").trim();

                //split the line into parts based on spaces
                String[] parts = line.split(" ");

                //check if the line contains at least two parts and matches the user input
                if (parts.length > 1 && parts[0].equals(userInput)) {
                    System.out.println("Bank details:");
                    System.out.println("Bank code: " + parts[0]);
                    System.out.println("Bank name: " + parts[1]); //bank name is likely in the second column
                    found = true;
                    break;
                }
            }

            //if no matching bank was found, notify the user
            if (!found) {
                System.out.println("No bank found for the entered account prefix.");
            }

            //close the reader
            reader.close();
        } catch (Exception e) {
            //handle potential exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            //close the scanner
            scanner.close();
        }
    }
}
