package org.example.AutoWiring.OnlineBookStore;

public class Book {
    private int bookId;
    private String bookTitle;

    public Book(int bookId, String bookTitle) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }
}
