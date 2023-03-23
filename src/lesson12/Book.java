package lesson12;

public class Book {
    private String name;
    private Author author;
    private int publishedYear;

    public Book(String name, Author author, int publishedYear) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }

    public void setpublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}
