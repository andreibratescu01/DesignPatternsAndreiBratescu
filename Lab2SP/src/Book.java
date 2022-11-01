
import java.util.*;
public class Book {
    private String title;
    private ArrayList<Chapter> chapters = new ArrayList<>();
    private ArrayList<Author> authors = new ArrayList<>();
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
        for(Author auth : authors)
            auth.print();
        for(Chapter ch : chapters)
            ch.print();

    }
}