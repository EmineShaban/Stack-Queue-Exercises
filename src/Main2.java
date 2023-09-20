import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int[] command = Arrays
                .stream(sc
                        .nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int numsLength = command[0];
        int numsRemove = command[1];
        int num = command[2];

        int[] nums = Arrays
                .stream(sc
                        .nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numsLength; i++) {
            stack.push(nums[i]);

        }

        for (int i = 0; i < numsRemove; i++) {
            stack.pop();
        }

        if (stack.contains(num)) {
            System.out.println(stack.contains(num));

        } else if (stack.isEmpty()) {
            System.out.println(0);

        } else {
            int n = stack.size();
            int max = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
            if(stack.peek() < max){
                max = stack.pop();
            }
            }
            System.out.println(max);

        }


    }
}