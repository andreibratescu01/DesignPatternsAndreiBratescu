import java.util.ArrayList;

public class SubChapter {
    private String name;
    private Chapter chapter;
    private ArrayList<Element> elements = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }
    public void addElement(Element e)
    {
        elements.add(e);
    }

    public void print()
    {
        System.out.println(this.name);
        for(Element el: elements)
            el.print();
    }
}

