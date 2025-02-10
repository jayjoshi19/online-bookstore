package service;

import exception.BookNotFoundException;
import exception.InsufficientStockException;
import model.Book;

import java.util.*;

public class BookStoreService {

    Book book = new Book();
    ArrayList<Book> bookArrayList = new ArrayList<>();
    LinkedList<Book> purchaseBookList = new LinkedList<>();
    HashSet<String> authorNames = new HashSet<>();
    TreeSet<String> bookNames = new TreeSet<>();


    // adds a new book to the book store
    // add new book to the list
    public void addBook() {

        Book book1 = new Book("B101", "Java Programming", "James Gosling", 50.00, 10);
        Book book2 = new Book("B102", "Clean Code", "Robert C. Martin", 40.00, 8);
        Book book3 = new Book("B103", "Effective Java", "Joshua Bloch", 55.00, 12);
        Book book4 = new Book("B104", "Programming with C", "E Balagurusamy", 85.00, 13);
        Book book5 = new Book("B105", "SQL, PL/SQL", "Ivan Bayross", 55.00, 17);

        bookArrayList.add(book1);
        bookArrayList.add(book2);
        bookArrayList.add(book3);
        bookArrayList.add(book4);
        bookArrayList.add(book5);

        // available books
        viewBooks();
    }

    // removes a book from the book store
    // remove book from book list
    public void removeBook(String bookId) {
        Iterator<Book> itr = bookArrayList.iterator();
        while (itr.hasNext()) {
            Book book = itr.next();
            if (book.getBookId().equals(bookId)) {
                System.out.println("Removing the book with id : " + bookId);
                itr.remove();
            }
        }
        System.out.println("---Available books after removing the book : " + bookId);
        viewBooks();
        System.out.println();
    }

    // display all books available in the bookstore using ArrayList
    public void viewBooks(){
        for (Book book : bookArrayList) {
            System.out.println("Book Id : " + book.getBookId()
                    + ", Title : " + book.getTitle() + ", Author : "+book.getAuthor()
                    + ", Price : "+book.getPrice()+ ", Available Quantity : "+book.getAvailableQty());
        }
    }

    // purchases a new book from the book store
    // maintain purchased books using linked list
    // reduce the quantity of book from the bookstore
    // if book is not found, throws a BookNotFound Exception
    // if qty requested is more than available qty, it throws an InsufficientStock Exception
    public void purchaseBook(String bookId, int quantity) {
        Iterator<Book> itr = bookArrayList.iterator();
        boolean isFound = false;
        while (itr.hasNext()) {
            Book book = itr.next();
            // if the book is found in the store, then Book not found exception will be thrown
            if (book.getBookId().equals(bookId)) {

                // if specified quantity is found, then it will help purchase the book for the user
                if (quantity <= book.getAvailableQty()) {
                    System.out.println("Purchasing the book with id : " + bookId);
                    book.setAvailableQty(book.getAvailableQty() - quantity);
                    book.setPurchasedQty(quantity);

                    isFound = true;
                    purchaseBookList.add(book);
                    displayPurchasedBook(book);
                }
                // if specified purchase qty is not found, then insufficient stock exception will be thrown
                if (quantity > book.getAvailableQty()) {
                    System.out.println();
                    throw new InsufficientStockException("Quantity for " + bookId + " is not sufficient in the stock");
                }

            } else if (!isFound){
                // if the book is not found in the store, then Book not found exception will be thrown
                System.out.println();
                throw new BookNotFoundException("Book with id : " + bookId + ", '" + book.getTitle() + "' is not found in the store");
            }
        }

        // if the book is not available in the store, then Book not found exception will be thrown
        /*if (!isFound) {
            System.out.println();
            throw new BookNotFoundException("Book with id : " + bookId + " is not found in the store");
        }*/
    }

    // Search a book by title and returns all Book details
    // use TreeSet, so they can be searched lexicographically by title
    // if book is not found, throws a BookNotFound Exception
    public void searchBook(String title) {
        boolean isFound = false;
        for (Book book : bookArrayList) {
            if (book.getTitle().equals(title)) {
                System.out.println("Finding book : '" + title + "'");
                displaySearchedBook(book);
                isFound = true;
            }
        }
        if (!isFound){
            System.out.println();
            throw new BookNotFoundException("Book with title : '" + title + "' is not found in the store");
        }
    }

    // displays all the books that have been purchased
    // use TreeSet, so they can be listed lexicographically by title
    public void displayBooksLexicographically() {
        for (Book book : bookArrayList) {
            bookNames.add(book.getTitle());
        }
        for (String title : bookNames) {
            System.out.println(title);
        }
    }

    // calculate total inventory value by multiplying the price of each book ny the quantity available
    // book price * available book qty
    public void getInventoryValue() {
        double invTotal = 0.0;
        for (Book book : bookArrayList) {
            invTotal = book.getPrice() * book.getAvailableQty();
        }
        System.out.println("Total Inventory value = "+invTotal);
    }

    // use Hashset to store unique authors
    public void displayUniqueAuthors() {
        for (Book book : bookArrayList) {
            authorNames.add(book.getAuthor());
        }
        for (String authorName : authorNames) {
            System.out.println(authorName);
        }
    }

    public void displayPurchasedBook(Book book){
        System.out.println("Book Id : " + book.getBookId());
        System.out.println("Book Title : " + book.getTitle());
        System.out.println("Book Author : " + book.getAuthor());
        System.out.println("Book Price : " + book.getPrice());
        System.out.println("Quantity purchased : " + book.getPurchasedQty());
        System.out.println("Remaining Quantity : " + book.getAvailableQty());
        System.out.println("Above book purchased.");
    }

    public void displaySearchedBook(Book book){
        System.out.println("Book Id : " + book.getBookId());
        System.out.println("Book Title : " + book.getTitle());
        System.out.println("Book Author : " + book.getAuthor());
        System.out.println("Book Price : " + book.getPrice());
        System.out.println("Quantity Available : " + book.getAvailableQty());
    }
}
