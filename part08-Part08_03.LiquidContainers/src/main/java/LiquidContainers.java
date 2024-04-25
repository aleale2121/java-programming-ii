
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;
        while (true) {
            System.out.println("First:" + firstContainer + "/" + 100);
            System.out.println("Second:" + secondContainer + "/" + 100);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts.length > 1 ? parts[1] : "0");
            if (amount > 0) {
                switch (command) {
                    case "add":
                        firstContainer = Math.min(firstContainer + amount, 100);
                        break;
                    case "move":
                        if (firstContainer > 0) {
                            int amountToMove = Math.min(firstContainer, amount);

                            secondContainer = Math.min(secondContainer + amountToMove, 100);
                            firstContainer = Math.max(firstContainer - amount, 0);
                        }
                        break;
                    case "remove":
                        secondContainer = Math.max(0, secondContainer - amount);
                        break;
                    default:
                        System.out.println("Invalid command!");
                }
            }
            System.out.println();
        }
    }
}
