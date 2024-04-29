package service;

import lombok.Getter;
import lombok.Setter;
import model.Book;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BooksCatalogService {
    private List<Book> booksCatalog = new ArrayList<>();

    public BooksCatalogService() {
    }

    public void addBook(Book book) {
        this.booksCatalog.add(book);
    }

    public List<Book> findByAuthor(String authorName) {
        List<Book> booksFound = new ArrayList<>();
        if (!this.booksCatalog.isEmpty()) {
            for (Book book : this.booksCatalog) {
                if (book.getAuthor().equalsIgnoreCase(authorName)) {
                    booksFound.add(book);
                }
            }
        }
        return booksFound;
    }

    public Book findByTitle(String title) {
        Book bookFound = new Book();
        if (!this.booksCatalog.isEmpty()) {
            for (Book book : this.booksCatalog) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    bookFound = book;
                    break;
                }
            }
        }
        return bookFound;
    }

    public List<Book> findByYearInterval(int initialYear, int finalYear) {
        List<Book> booksFound = new ArrayList<>();
        if (!this.booksCatalog.isEmpty()) {
            for (Book book : this.booksCatalog) {
                if (book.getYearRelease() >= initialYear && book.getYearRelease() <= finalYear) {
                    booksFound.add(book);
                }
            }
        }
        return booksFound;
    }


}
