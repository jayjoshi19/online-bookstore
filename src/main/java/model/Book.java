package model;

public class Book {

    private String bookId;
    private String title;
    private String author;
    private double price;
    private int availableQty;
    private int purchasedQty;

    public Book(String bookId, String title, String author, double price, int availableQty) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.availableQty = availableQty;
    }

    public Book(){

    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    public int getPurchasedQty() {
        return purchasedQty;
    }

    public void setPurchasedQty(int purchasedQty) {
        this.purchasedQty = purchasedQty;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("bookId='").append(bookId).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", price=").append(price);
        sb.append(", availableQty=").append(availableQty);
        sb.append(", purchasedQty=").append(purchasedQty);
        sb.append('}');
        return sb.toString();
    }
}
