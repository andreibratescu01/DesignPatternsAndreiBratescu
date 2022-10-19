import java.util.Collection;

public class Chapter {
    private String name;
    private Book book;
    private Collection<SubChapter> subchapters = new Collection();
    private void print()
    {
        for(SubChapter s : subchapters)
            System.out.println(s);
    }

}
