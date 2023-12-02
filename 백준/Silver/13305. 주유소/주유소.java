import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] lengthArr = new int[N-1];
        int [] oilArr = new int[N];

        for(int length = 0; length < N-1; length++) {
            lengthArr[length] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int oil = 0; oil < N; oil++) {
            oilArr[oil] = Integer.parseInt(st.nextToken());
        }

        long now = oilArr[0];
        long answer = now * lengthArr[0];

        for(int i = 1; i<N-1; i++) {
            if (now >= oilArr[i]) {
                now = oilArr[i];
            }
            answer += now * lengthArr[i];
        }

        System.out.println(answer);

    }
}
