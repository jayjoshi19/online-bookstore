import exception.BookNotFoundException;
import exception.InsufficientStockException;
import model.Book;
import service.BookStoreService;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {

        char input;
        BookStoreService bookStoreService = new BookStoreService();

        // Adding books
        System.out.println("---Adding Books---");
        bookStoreService.addBook();

        // Removing the books
        System.out.println("\n---Removing books---");
        bookStoreService.removeBook("B101");

        // Purchasing books ---> Check each purchaseBook() method calls one after the other by commenting them out.
        System.out.println("---Purchasing books---");
        try {
            // successful
            bookStoreService.purchaseBook("B102", 2);
            // Book not found
            //bookStoreService.purchaseBook("B1020", 12);
            // Insufficient Stock
            //bookStoreService.purchaseBook("B102", 55);
        } catch (BookNotFoundException | InsufficientStockException e) {
            System.out.println(e.getMessage());
        }

        // Check all available books
        /*System.out.println("---Check all available books---");
        bookStoreService.viewBooks();*/


        // Search Book By Title
        System.out.println("\n---Search book by title---");
        try {
            bookStoreService.searchBook("Effective Java"); // Successful
            bookStoreService.searchBook("DSA with Java"); // Exception
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Display Books Lexicographically
        System.out.println("\n---Display Books Lexicographically---");
        bookStoreService.displayBooksLexicographically();

        // Display Unique Authors List
        System.out.println("\n---Display Unique Authors List---");
        bookStoreService.displayUniqueAuthors();

        // Display Total Inventory value
        System.out.println("\n---Display Total Inventory value---");
        bookStoreService.getInventoryValue();

    }
}
