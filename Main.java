import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Shruti");
        names.add("John");
        names.add("William");
        names.add("Harry");
        System.out.println(names.remove("Shruti"));
        System.out.println(names);

    }
}