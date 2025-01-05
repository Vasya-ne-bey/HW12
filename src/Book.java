import java.util.Objects;

public class Book {
    private String title;
    private Integer year;
    private Author author;

    public Book(String title, Integer year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(year, book.year) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, author);
    }

    @Override
    public String toString() {
        return "title: " + title + "\nyear: " + year + "\nauthor: " + author;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }
}
