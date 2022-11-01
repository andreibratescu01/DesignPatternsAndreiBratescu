import java.util.ArrayList;

public class Chapter {
    private String name;
    private Book book;
    public Chapter(String name) {
        this.name = name;
    }
    private ArrayList<SubChapter> subchapters = new ArrayList<>();
    public int createSubChapter(String subchapterName)
    {
        SubChapter s = new SubChapter(subchapterName);
        this.subchapters.add(s);
        return subchapters.indexOf(s);
    }
    public SubChapter getSubChapter(int index)
    {
        return subchapters.get(index);
    }

    public void print()
    {
        System.out.println(this.name);
        for(SubChapter sc : subchapters)
            sc.print();
    }


}
