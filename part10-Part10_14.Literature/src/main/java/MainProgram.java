
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        System.out.println("Input the name of the book, empty stops:");
        String bookName = scanner.nextLine().trim();

        while (!bookName.isEmpty()) {
            System.out.println("Input the age recommendation:");
            int ageRecommendation = Integer.parseInt(scanner.nextLine().trim());

            Book book = new Book(bookName, ageRecommendation);
            books.add(book);

            System.out.println("Input the name of the book, empty stops:");
            bookName = scanner.nextLine().trim();
        }

        System.out.println(books.size() + " books in total.");
        System.out.println("\nBooks:");

        // Sorting books based on age recommendation and name
        books.sort(Comparator.comparing(Book::getAge).thenComparing(Book::getName));

        for (Book book : books) {
            System.out.println(book);
        }
    }

}
