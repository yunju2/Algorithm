
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static StringBuffer sb = new StringBuffer();

    public static void solution(long num) {
        if(num == 1){
           sb.append(1);
           return;
        }
        solution(num/2);
        sb.append(num%2);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        solution(num);
        System.out.println(sb);
    }
}




