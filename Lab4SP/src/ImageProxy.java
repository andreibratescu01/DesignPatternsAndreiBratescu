import java.util.ArrayList;

public class ImageProxy  implements Element{
    private String name;
    private ArrayList<Image> realImage = new ArrayList<>();
    public ImageProxy (String name)
    {
        this.name = name;
    }
    public Image loadImage() {
        if(realImage == null)
        {
            realImage = new Image(name);
        }
        return realImage;
    }

    @Override
    public void print() {


    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public int get(int n) {
        return 0;
    }
}
