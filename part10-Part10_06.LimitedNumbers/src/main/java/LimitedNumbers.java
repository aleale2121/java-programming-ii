
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            Integer input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                break;
            }
            numbers.add(input);
        }
        numbers.stream().
                filter(n -> n >= 1 && n <= 5)
                .forEach(num -> System.out.println(num));
    }
}
