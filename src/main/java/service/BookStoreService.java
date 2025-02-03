package service;

import model.Book;

import java.util.LinkedList;

public class BookStoreService {

    // adds a new book to the book store
    public Book addBook(Book book) {

        return null;
    }

    // removes a book from the book store
    public void removeBook(String bookId) {

    }

    // purchases a new book from the book store
    // if book is not found, throws a BookNotFound Exception
    public void purchaseBook(String bookId, int quantity) {

    }

    // Search a book by title and returns all Book details
    // if book is not found, throws a BookNotFound Exception
    public Book searchBook(String title) {

        return null;
    }

    // displays all the books that have been purchased
    public LinkedList<Book> listPurchasedBooks() {

        return null;
    }

    // calculate total inventory value by multiplying the price of each book ny the quantity available
    // book price * book qty
    public double getInventoryValue() {
        return 0.0;
    }

}
