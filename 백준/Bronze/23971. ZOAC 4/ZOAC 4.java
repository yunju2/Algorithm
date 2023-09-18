import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input = br.readLine().split(" ");

        int H = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[2]);
        int M = Integer.parseInt(input[3]);

        int cnt = 0;
        int i =0;
        int j = 0;

        for(i = 0; i<H;  i = i + N + 1){
            for(j = 0; j<W; j = j + M + 1){
                cnt+=1;
            }
        }

        System.out.println(cnt);


    }

}