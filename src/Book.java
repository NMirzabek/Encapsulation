import java.util.List;

public class Book {
    private String name;
    private List<String> authors;
    private String isbn;
    private double price;

    public Book(String name, List<String> authors, String isbn, double price) {
        this.name = name;
        this.authors = authors;
        this.isbn = isbn;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printBookDetails() {
        System.out.println("Book Title: " + name);
        System.out.print("Authors: ");
        for (String author : authors) {
            System.out.print(author + " ");
        }
        System.out.println();
    }
}
