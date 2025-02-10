import model.Book;
import service.BookStoreService;

import java.util.Scanner;

public class BookMain_backup {

    public static void main(String[] args) {

        /*Book book1 = new Book("B101", "Java Programming", "James Gosling", 50.0, 10);
        Book book2 = new Book("B103", "Clean Code", "Robert C. Martin", 40.0, 5);
        Book book3 = new Book("B103", "Effective Java", "Joshua Bloch", 55.0, 8);*/

        char input;
        BookStoreService bookStoreService = new BookStoreService();
        Book book = null;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Welcome to Online Bookstore System");
            System.out.println();
            System.out.println("1. Add books to the bookstore");
            System.out.println("2. Purchase books from the bookstore");
            System.out.println("3. View all the books");
            System.out.println("4. Search a book");
            System.out.println("5. Display the purchased books");
            System.out.println("6. Display the Unique authors");
            System.out.println("7. Display the total Inventory value");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    do {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Enter Book Id:");
                        String bookId = scanner.nextLine();

                        System.out.println("Enter book title : ");
                        String title = scanner.nextLine();

                        System.out.println("Enter book author : ");
                        String author = scanner.nextLine();

                        System.out.println("Enter book price : ");
                        double price = scanner.nextDouble();

                        System.out.println("Enter book quantity : ");
                        int quantity = scanner.nextInt();

                        //book = bookStoreService.addBook(new Book(bookId, title, author, price, quantity));

                        System.out.println("Do you still want to add new book ?");
                        System.out.println("Press Y for Yes, N for No");
                        input = scanner.next().charAt(0);
                    } while (input == 'Y' || input == 'y');
                    break;

                case 2:
                    do {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Enter Book Id:");
                        String bookId = scanner.nextLine();

                        System.out.println("Enter quantity to purchase:");
                        int quantity = scanner.nextInt();

                        //bookStoreService.purchaseBook(book, bookId, quantity);

                        System.out.println("Do you still want to purchase more books ?");
                        System.out.println("Press Y for Yes, N for No");
                        input = scanner.next().charAt(0);
                    } while (input == 'Y' || input == 'y');

                    break;

                case 3:
                    bookStoreService.viewBooks();
                    break;

                case 4:
                    bookStoreService.searchBook("Java Programming");
                    break;

                case 5:
                    bookStoreService.displayBooksLexicographically();
                    break;

                case 6:
                    bookStoreService.displayUniqueAuthors();
                    break;

                case 7:
                    bookStoreService.getInventoryValue();
                    break;

                default:
                    break;
            }
            System.out.println("Do you want to continue further ?");
            System.out.println("Press Y for Yes, N for No");
            input = sc.next().charAt(0);

        } while (input == 'Y' || input == 'y');

    }
}
