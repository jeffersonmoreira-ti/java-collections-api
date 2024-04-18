package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

@Setter
@Getter
@AllArgsConstructor
public class Book implements Comparable<Book> {


    private String title;
    private int yearRelease;
    private String author;

    @Override
    public int compareTo(Book b) {
        return title.compareTo(b.title);
    }

    static class CompareTitle implements Comparator<Book> {

        @Override
        public int compare(Book b1, Book b2) {
            return b1.getTitle().compareTo(b2.author);
        }

        static class CompareYearRelease implements Comparator<Book> {

            @Override
            public int compare(Book b1, Book b2) {
                return Integer.compare(b1.getYearRelease(), b2.getYearRelease());
            }
        }

        static class CompareAuthor implements Comparator<Book> {
            @Override
            public int compare(Book b1, Book b2){
                return b1.getAuthor().compareTo(b2.getAuthor());
            }
        }
    }
}
