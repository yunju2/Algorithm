import java.io.*;
import java.util.*;

public class Main {
    public static String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        int i = 0;

        for (char c : str.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";


        return answer;

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        for (int i = 0; i < num; i++) {
            System.out.println(solution(sc.next()));
        }


    }
}




