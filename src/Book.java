public class Book {
    private String title;
    private Integer year;
    private Author author;

    public Book (String title, Integer year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
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
