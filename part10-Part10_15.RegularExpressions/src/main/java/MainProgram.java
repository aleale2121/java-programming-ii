
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner scanner = new Scanner(System.in);
        Checker checker=new Checker();
        // Day of week check
        System.out.println("Enter a string:");
        String inputDay = scanner.nextLine().trim();
        if (checker.isDayOfWeek(inputDay)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }

        // Vowel check
        System.out.println("Enter a string:");
        String inputVowel = scanner.nextLine().trim();
        if (checker.allVowels(inputVowel)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }

        // Time of day check
        System.out.println("Enter a string:");
        String inputTime = scanner.nextLine().trim();
        if (checker.timeOfDay(inputTime)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
