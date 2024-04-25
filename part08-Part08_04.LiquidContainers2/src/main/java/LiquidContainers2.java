
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First:" + firstContainer.contains() + "/" + 100);
            System.out.println("Second:" + secondContainer.contains() + "/" + 100);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts.length > 1 ? parts[1] : "0");
            switch (command) {
                case "add":
                    firstContainer.add(amount);
                    break;
                case "move":
                    if (firstContainer.contains() > 0) {
                        int amountToMove = Math.min(firstContainer.contains(), amount);

                        secondContainer.add(amountToMove);
                        firstContainer.remove(amountToMove);
                    }
                    break;
                case "remove":
                    secondContainer.remove(amount);
                    break;
                default:
                    System.out.println("Invalid command!");
            }

            System.out.println();

        }

    }

}
