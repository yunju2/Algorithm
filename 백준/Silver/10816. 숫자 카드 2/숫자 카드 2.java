import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;

    private static int lowBound(int[] arr, int num) {
        int left = 0;
        int right = N;
        while (left < right) {
            int mid = (left + right) / 2;
            if (num <= arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static int highBound(int[] arr, int num) {
        int left = 0;
        int right = N;
        while (left < right){
            int mid = (left + right) / 2;
            if (num<arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int[] card = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Arrays.sort(card);

        for (int j = 0; j < M; j++) {
            int k = Integer.parseInt(st.nextToken());
            sb.append(highBound(card, k) - lowBound(card, k)).append(" ");
        }


        System.out.println(sb);


    }
}
