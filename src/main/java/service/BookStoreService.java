package service;

import model.Book;

import java.util.ArrayList;
import java.util.LinkedList;

public class BookStoreService {

    ArrayList<Book> bookArrayList = new ArrayList<>();

    LinkedList<Book> bookLinkedList = new LinkedList<>();

    // adds a new book to the book store
    // add new book to the list
    public ArrayList<Book> addBook(Book book) {
        bookArrayList.add(book);
        System.out.println(bookArrayList);
        //System.out.println("Add book called...");
        return bookArrayList;
    }

    // removes a book from the book store
    // remove book from book list
    public void removeBook(String bookId) {

    }

    // purchases a new book from the book store
    // maintain purchased books using linked list
    // if book is not found, throws a BookNotFound Exception
    public void purchaseBook(String bookId, int quantity) {
        System.out.println("purchase book called...");
    }

    // Search a book by title and returns all Book details
    // use TreeSet, so they can be searched lexicographically by title
    // if book is not found, throws a BookNotFound Exception
    public Book searchBook(String title) {
        System.out.println("search book called...");
        return null;
    }

    // displays all the books that have been purchased
    // use TreeSet, so they can be listed lexicographically by title
    public LinkedList<Book> listPurchasedBooks() {
        System.out.println("list all purchased books called...");
        return null;
    }

    // calculate total inventory value by multiplying the price of each book ny the quantity available
    // book price * book qty
    public double getInventoryValue() {
        System.out.println("Get inventory value called...");
        return 0.0;
    }

    // use Hashset to store unique authors
    public void displayUniqueAuthors() {
        System.out.println("Display unique authors called...");
    }
}
