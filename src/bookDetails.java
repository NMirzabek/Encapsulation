import java.util.List;
import java.util.Arrays;

public class bookDetails {
    public static void main(String[] args) {
        List<String> authors = Arrays.asList("Mirzabek", "Sardor");
        Book book = new Book("Example Book", authors, "0123456891123", 29.99);
        book.printBookDetails();
    }
}
