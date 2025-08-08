package org.example.AutoWiring.OnlineBookStore;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class BookRepositroy {
    private List<Book> bookList;

    public BookRepositroy(List<Book> bookList) {
        this.bookList = bookList;
    }


    @Override
    public String toString() {
        return "BookRepositroy{" +
                "bookList=" + bookList +
                '}';
    }
}
