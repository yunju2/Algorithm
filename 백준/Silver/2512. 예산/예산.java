import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int localNum = Integer.parseInt(br.readLine());
        int [] budget = new int[localNum];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < localNum; i++) {
            budget[i] = Integer.parseInt(st.nextToken());
        }

        int total = Integer.parseInt(br.readLine());


        Arrays.sort(budget);

        int start = 0;
        int end = budget[localNum-1];
        int answer = 0;

        while(start <= end) {
            int sum = 0;
            int mid = (start + end) / 2;

            for(int i = 0; i<localNum; i++) {
                sum += Math.min(budget[i],mid);
            }

            if(sum <= total) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid -1;
            }



        }

        System.out.println(answer);






    }
}
