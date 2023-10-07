import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int [] dp = new int [1001];

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;


        for(int i = 4; i<=1000; i++){
            dp[i] = (i / 3) + (i % 3);
        }

        if(dp[n] % 2 == 0) System.out.println("CY");
        else System.out.println("SK");





    }



        }


