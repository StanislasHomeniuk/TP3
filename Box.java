import java.util.ArrayList;

public class Box{
    ArrayList<String> contents = new ArrayList<String>();
    public Box(){System.out.println("Box créée");}

    public void add(String truc){
        this.contents.add(truc);
    }
}
