import java.util.LinkedList;

public class newLinkedList {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Shruti");
        names.add("Jay");
        names.add("Veeru");
        names.add("Basanti");
        System.out.println(names);
        names.add(2,"Thakur");
        System.out.println(names);
    }

}
