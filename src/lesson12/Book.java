package lesson12;

public class Book {
    private String name;
    private String author;
    private int publishedYear;

    public Book(String name, String author, int publishedYear) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }

    public void setpublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}
