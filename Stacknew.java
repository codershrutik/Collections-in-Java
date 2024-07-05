import java.util.Stack;

public class Stacknew {
    public static void main(String[] args) {
        
        Stack<Integer> nums = new Stack<>();
        nums.push(1);
        nums.push(2);
        nums.push(3);
        nums.push(4);
        nums.push(5);
        System.out.println(nums);
        System.out.println(nums.isEmpty());
        System.out.println(nums.search(3));
        System.out.println(nums.pop());
        System.out.println(nums);

    }
}
