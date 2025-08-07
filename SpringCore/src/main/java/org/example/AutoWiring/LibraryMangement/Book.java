package org.example.AutoWiring.LibraryMangement;

public class Book {
    private String bookTitle;
    private  String authorName;

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void displayinfo(){
        System.out.println("Book :" + getBookTitle() + "Author Name :" +getAuthorName());
    }
}
