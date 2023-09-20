import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int[] nums = Arrays
                .stream(sc
                        .nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();



        for (int i = 0; i < nums.length; i++) {
             stack.push(nums[i]);
        }



        for (int i = 0; i <= nums.length; i++) {
            System.out.println(stack.pop());

        }
    }
}