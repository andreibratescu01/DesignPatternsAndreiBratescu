
import java.util.*;
public class Book extends Section {
    private String title;
    private ArrayList<Author> authors = new ArrayList<>();
    private Section section;
    public Book(String title) {
        this.title = title;
    }
    public void addAuthor(Author author)
    {
        this.authors.add(author);
    }
    public int createChapter(String chapterName)
    {
        Chapter ch = new Chapter(chapterName);
        this.chapters.add(ch);
        return chapters.indexOf(ch);
    }
    public Chapter getChapter(int index)
    {
        return chapters.get(index);
    }
    public void print()
    {
        System.out.println(this.title);
        System.out.println(this.section);
    }
}