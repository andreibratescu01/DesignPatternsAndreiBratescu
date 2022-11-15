
import java.util.*;
public class Book extends Section {
    private String title;
    private ArrayList<Author> authors = new ArrayList<>();
    public Book(String title) {
        this.title = title;
    }
    public void addAuthor(Author author)
    {
        this.authors.add(author);
    }
    public void addContent(Element e)
    {
        this.elements.add(e);
    }
    public void print()
    {
        System.out.println("Book: " + this.title + "\n\nAuthors:");
        for(Author a: authors) {
            System.out.print("Author: ");
            a.print();
        }
        System.out.println("\n");
        super.print();
    }
}