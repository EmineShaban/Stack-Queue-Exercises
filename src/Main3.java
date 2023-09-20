import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;


public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> forward = new ArrayDeque<>();


        while(true){
            String command = sc.nextLine();
            if(command.equals("Home")){
                break;
            } else if (command.equals("back")) {
                if(forward.isEmpty() || forward.size() == 1){
                    System.out.println("no previous URLs");
                }else {
                    forward.pop();
                     System.out.println(forward.peek());

                }
            }else{
                forward.push(command);
                System.out.println(command);
            }
        }



    }
}