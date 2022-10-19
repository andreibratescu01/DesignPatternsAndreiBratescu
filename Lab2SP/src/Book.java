
import java.util.*;
public class Book {
    private String title;
    private Collection<Author> authors;
    private Collection<Chapter> chapters = new Collection();
    public Book(String title) {
        this.title = title;
    }
    private void addAuthor(Author author)
    {
        this.authors.add(author);
    }
    private void createChapter(Chapter chapter)
    {
        this.chapters.add(chapter);
    }
    public void print(){
        System.out.println("Authors:");
        for(Author a : authors)
            System.out.println(a);
        System.out.println("Chapters:")
        for(Chapter c : chapters)
            System.out.println(c);
    }
}