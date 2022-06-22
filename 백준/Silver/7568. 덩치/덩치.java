import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int spec [][] = new int [N][2];

        int rank [] = new int[N];

        String[] sp;
        for(int i =0; i<spec.length; i++){
            sp = br.readLine().split(" ");
            spec[i][0] = Integer.parseInt(sp[0]);
            spec[i][1] = Integer.parseInt(sp[1]);

            rank[i] = 1;
        }

        //1. 키와 몸무게 비교한다. N번 돌아야한다.
        for(int i =0; i< N;i++){
            for(int j = 0; j< N; j++){
                if(spec[i][0]>spec[j][0] && spec[i][1]>spec[j][1]){
                    //2. 등수를 매긴다. 덩치가 큰 사람이 있을 경우 해당 사람은 순위가 밀린다.
                    rank[j]++;
                }
            }
        }

        for(int k = 0; k<N; k++){
            System.out.print(rank[k]+" ");
        }


    }
}