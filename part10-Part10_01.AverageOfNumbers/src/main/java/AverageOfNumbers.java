
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> inputs = new ArrayList<>();

        // reading inputs
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

        double avg = inputs.stream().
                mapToInt(s -> Integer.valueOf(s)).
                average()
                .getAsDouble();

        System.out.println("average of the numbers: " + avg);
    }
}
