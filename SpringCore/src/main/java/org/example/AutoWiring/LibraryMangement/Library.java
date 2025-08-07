package org.example.AutoWiring.LibraryMangement;

import java.util.List;

public class Library {
    private List<Book> bookList;
    private Librarianian librarianian;

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Librarianian getLibrarianian() {
        return librarianian;
    }

    public void setLibrarianian(Librarianian librarianian) {
        this.librarianian = librarianian;
    }

    public void mamngeLibrary(){
        for(Book book : bookList){
            book.displayinfo();
        }
        librarianian.issueBook();
        librarianian.returnBook();
    }

}
