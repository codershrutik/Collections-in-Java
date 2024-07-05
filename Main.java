import java.util.ArrayList;

class IntWrapper{
    public int num;

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }

    public IntWrapper(int num){
        this.num = num;
    }
}

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(56); //Autobonxing
        numberList.add(45);
        System.out.println(numberList); //Auto-unboxing

        ArrayList<IntWrapper> numList2 = new ArrayList<>();
        numList2.add(new IntWrapper(34));  //manual-boxing
        numList2.add(new IntWrapper(23));
        System.out.println(numList2.get(0).getNum()); 

    }
}