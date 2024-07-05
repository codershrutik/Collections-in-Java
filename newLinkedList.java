import java.util.*;

public class newLinkedList {
    public static void main(String[] args) {
        // LinkedList<String> names = new LinkedList<>();
        // names.add("Shruti");
        // names.add("Jay");
        // names.add("Veeru");
        // names.add("Basanti");
        // System.out.println(names);
        // names.add(2,"Thakur");
        // System.out.println(names);

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Jay");
        list1.add("Veeru");
        list1.add("Basanti");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Google");
        list2.add("Microsoft");
        list2.add("Amazon");
        list1.add("Shruti");

        System.out.println(list1);
        // System.out.println(list2);
        // new Main().printList(list1);

        list2.sort(null);
        System.out.println(list2);
        Collections.reverse(list2);
    }

    public void printList(List<String> list){
        Iterator<String> data = list.listIterator();
        while(data.hasNext()){
            System.out.println(data.next());
        }
    }

}
