
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
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
        System.out.println();
        System.out.println("Print the average of the negative numbers or the positive numbers? \n(n/p)");
        String command = scanner.nextLine();
        if (command.equals("n")) {
            double avg = inputs.stream().
                    mapToInt(s -> Integer.valueOf(s)).
                    filter(n -> n < 0).
                    average()
                    .getAsDouble();
            System.out.println("average of the negative numbers: " + avg);

        } else {
            double avg = inputs.stream().
                    mapToInt(s -> Integer.valueOf(s)).
                    filter(n -> n > 0).
                    average()
                    .getAsDouble();
            System.out.println("average of the positive numbers: " + avg);

        }

    }
}
