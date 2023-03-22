package lesson12;

public class Author {
    String authorFirstName;
    String authorSurname;

    public Author(String authorFirstName, String authorSurname) {
        this.authorFirstName = authorFirstName;
        this.authorSurname = authorSurname;
    }
    public String getAuthorFirstName() {
        return this.authorFirstName;
    }
    public String getAuthorSurname() {
        return this.authorSurname;
    }
}
