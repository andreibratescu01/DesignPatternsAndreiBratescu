import java.util.ArrayList;

public class Section implements Element{
    private String title;
    public ArrayList<Element> elements = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public Section(){}

    public void add(Element e)
    {
        elements.add(e);
    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public int get(int n) {
        return 0;
    }


    public void print()
    {
        if(this.title!=null)
        System.out.println(this.title);
        for(Element e: elements)
            e.print();
    }
}

