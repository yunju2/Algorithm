import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
   static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   static int rank;

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int t_score =Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int [] score = new int[P];

        if(N>0){
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i<N;i++){
                score[i] = Integer.parseInt(st.nextToken());
            }
        }

        // 배열 score를 비오름차순으로 정렬
        Arrays.sort(score);
        int r = 1;

        if(t_score <= score[0] && N == P){
            r = -1;
        } else{
            for(int i = P-1 ; i>=Math.max(0,P-N-1); i--){
                if(t_score < score[i]) {
                    r ++;
                } else break;
            }

        }

        System.out.println(r);


    }
}