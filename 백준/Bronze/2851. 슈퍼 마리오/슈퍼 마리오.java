import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        int score = 0;


        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }


        
        for (int i = 0; i < arr.length; i++) {
            score += arr[i];

            if(Math.abs((score-arr[i])-100) < score - 100){
                score = score - arr[i];
                break;
            }
        }
        System.out.println(score);

    }
}
