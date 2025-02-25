import java.lang.*;
import java.util.*;

class Name implements java.lang.Comparable<Name>{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    Name(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
    public int compareTo(Name obj){
        return 0;
    }
}
public class Comparable {
    public static void main(String[] args) {
        List names = new LinkedList<>();
        names.add(new Name("Shruti"));
        names.add(new Name("Ed"));
        names.add(new Name("John"));
        names.add(new Name("Mia"));

        System.out.println(names);
        names.sort(null);
        System.out.println(names);
    }
}
