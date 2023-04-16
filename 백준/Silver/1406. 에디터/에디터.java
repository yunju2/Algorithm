import java.io.*;
import java.util.*;


public class Main {

    static Stack<Character> stack = new Stack<>();
    static Stack<Character> tmp = new Stack<>();


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        //입력값 넣기
        for (int i = 0; i < input.length(); i++) {
            stack.add(input.charAt(i));
        }

        int cnt = Integer.parseInt(br.readLine());

        //명령어 받기

        while (cnt-- > 0) {
            String command = br.readLine();
            char c = command.charAt(0);
            switch (c) {
                case 'L':
                    if (!stack.isEmpty()) tmp.push(stack.pop());
                    break;
                case 'B':
                    if (!stack.isEmpty()) stack.pop();
                    break;
                case 'D':
                    if (!tmp.isEmpty()) stack.push(tmp.pop());
                    break;
                case 'P':
                    char t = command.charAt(2);
                    stack.push(t);
                    break;
            }
        }
        while(!stack.isEmpty())
            tmp.push(stack.pop());

        while(!tmp.isEmpty())
           bw.write(tmp.pop());

        bw.flush();
        bw.close();
    }


}



