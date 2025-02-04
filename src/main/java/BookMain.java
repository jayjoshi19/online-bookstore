import model.Book;
import service.BookStoreService;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {

        /*Book book1 = new Book("B101", "Java Programming", "James Gosling", 50.0, 10);
        Book book2 = new Book("B103", "Clean Code", "Robert C. Martin", 40.0, 5);
        Book book3 = new Book("B103", "Effective Java", "Joshua Bloch", 55.0, 8);*/

        BookStoreService bookStoreService = new BookStoreService();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Online Bookstore System");
        System.out.println();
        System.out.println("1. Add books to the bookstore");
        System.out.println("2. Purchase books from the bookstore");
        System.out.println("3. Display all the books");
        System.out.println("4. Display the purchased books");
        System.out.println("5. Display the Unique authors");
        System.out.println("6. Display the total Inventory value");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Book Id:");
                String bookId = scanner.next();

                System.out.println("Enter book title : ");
                String title = scanner.next();

                System.out.println("Enter book author : ");
                String author = scanner.next();

                System.out.println("Enter book price : ");
                Double price = scanner.nextDouble();

                System.out.println("Enter book quantity : ");
                int quantity = scanner.nextInt();

                bookStoreService.addBook(new Book(bookId, title, author, price, quantity));
                break;

            case 2:
                bookStoreService.purchaseBook("B101", 1);
                break;

            case 3:
                bookStoreService.searchBook("Java Programming");
                break;

            case 4:
                bookStoreService.listPurchasedBooks();
                break;

            case 5:
                bookStoreService.displayUniqueAuthors();
                break;

            case 6:
                bookStoreService.getInventoryValue();
                break;

            default:
                break;
        }

    }
}
