import lesson12.Author;
import lesson12.Book;

public class Main {
    public static void main(String[] args) {
//        Book warAndPeace = new Book("Война и Мир", "Л. Н.Толстой", 1867);
//        Book harryPotter = new Book("Гарри Поттер", "Дж. Роулинг", 1997);
        Book warAndPeace = new Book("Война и мир", "")

        System.out.println("warAndPeace = " + warAndPeace.getName());
        System.out.println("warAndPeace.getAuthor() = " + warAndPeace.getAuthor());
        System.out.println("warAndPeace.getPublishedYear() = " + warAndPeace.getPublishedYear());
        System.out.println();
        System.out.println("harryPotter = " + harryPotter.getName());
        System.out.println("harryPotter.getAuthor() = " + harryPotter.getAuthor());
        System.out.println("harryPotter.getPublishedYear() = " + harryPotter.getPublishedYear());

        harryPotter.setpublishedYear(1998);
        System.out.println("harryPotter.getPublishedYear() = " + harryPotter.getPublishedYear());
        System.out.println();


    }
}