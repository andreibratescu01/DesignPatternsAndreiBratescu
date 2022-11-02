import java.util.ArrayList;

public class Section implements Element{
    private String title;
    private ArrayList<Element> elements = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }
    public void add(Element e)
    {
        elements.add(e);
    }


    public void print()
    {
        System.out.println(this.title);
    }
}

