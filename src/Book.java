import java.util.*;
public class Book {
    public String title;
    public List<String> content = new ArrayList<String>();
    public Book(String title)
    {
        this.title = title;
    }
    public void createNewParagraph(String s)
    {
        content.add(s);
    }
    public void createNewImage(String i)
    {
        content.add(i);
    }
    public void createNewTable(String t)
    {
        content.add(t);
    }
    public void print()
    {
        System.out.println(this.title);
        content.forEach(System.out::println);
    }
}
