
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int cnt = Integer.parseInt(br.readLine());

        while (cnt-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (pq.isEmpty()) {
                    sb.append('0').append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            } else {
                pq.add(num);
            }

        }
        br.close();
        System.out.println(sb);

    }


}