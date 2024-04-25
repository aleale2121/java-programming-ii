
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alefew
 */
public class UserInterface {

    private Scanner scanner;
    private TodoList todos;

    public UserInterface(TodoList todos, Scanner scanner) {
        this.scanner = scanner;
        this.todos = todos;
    }

    public void start() {

        while (true) {
            System.out.print("Command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add:");
                String task = scanner.nextLine();
                todos.add(task);
                continue;
            } else if (command.equals("list")) {
                todos.print();
                continue;
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed?");
                int idx = Integer.valueOf(scanner.nextLine());
                todos.remove(idx);
                continue;
            }

//            System.out.println("Unknown command");
        }

    }
}
