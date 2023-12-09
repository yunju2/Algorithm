import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static int[] visited(int N, int M, int[] arr) {

        int[] answer = {0, 0};
        int sum = 0;
        for (int i = 0; i < M; i++) {
            sum += arr[i];
        }
        answer[0] = sum;
        answer[1] = 1;

        for (int j = M; j < N; j++) {
            sum += (arr[j] - arr[j - M]);

            if (answer[0] < sum) {
                answer[0] = sum;
                answer[1] = 1;
            } else if (sum == answer[0]) {
                answer[1] += 1;
            }
        }


        return answer;
    }

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] answer = visited(N, M, arr);

        if (answer[0] == 0) {
            System.out.print("SAD");
        } else {
            System.out.println(answer[0]);
            System.out.println(answer[1]);
        }


    }
}
