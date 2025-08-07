package org.example.AutoWiring.OnlineBookStore;

import java.util.List;

public class BookService {
    private BookRepositroy bookRepositroy;

    public BookService(BookRepositroy bookRepositroy) {
        System.out.println("using constrctuor");
        this.bookRepositroy = bookRepositroy;
    }

    public void setBookRepositroy(BookRepositroy bookRepositroy) {
        System.out.println("using setter");
        this.bookRepositroy = bookRepositroy;
    }

    public BookRepositroy getBookRepositroy() {
        return bookRepositroy;
    }

    public BookService() {
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookRepositroy=" + bookRepositroy +
                '}';
    }
}
