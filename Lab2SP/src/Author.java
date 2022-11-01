public class Author {
    private String name;
    private Book book;
    public Author(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println(this.name);
    }
}
