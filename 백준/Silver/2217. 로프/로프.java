import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N];

        for(int i = 0; i<N; i++) {
            arr[i]  = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int answer = arr[N-1];
        for(int i = N - 1; i >= 0; i--) {
            answer =  Math.max(answer,arr[i] * (N - i));
        }

        System.out.println(answer);

    }
}
