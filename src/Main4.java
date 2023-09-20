import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();

        String[] nums = sc.nextLine().split(" ");

//        System.out.println(Arrays.toString(nums));

        for (int i = nums.length -1 ; i >= 0; i--) {
            stack.push(nums[i]);
        }

//        System.out.println(stack);
        int n0 = 0;

        for (int i = 0; i < nums.length/2; i++) {
            int n1 = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int n2 = Integer.parseInt(stack.pop());
            n0 = 0;
            if(operator.equals("+")){
                n0 = n1 + n2;
                stack.push(Integer.toString(n0));
            }else {
                n0 = n1 - n2;
                stack.push(Integer.toString(n0));

            }

        }
        System.out.println(n0);

        }
}