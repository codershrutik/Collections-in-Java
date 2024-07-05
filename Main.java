import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Shruti");
        names.add("John");
        names.add("William");
        names.add("Harry");
        names.add("Louis");
        names.add("Niel");
        names.add("Ludwig");
        System.out.println(names);
        for(String temp: names){
            System.out.println(temp);
        }
        System.out.println(names.get(3));
        names.remove(1);
        System.out.println(names);
    }
}