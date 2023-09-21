import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;

        if (N == 1){
            System.out.println(1);
        }else {
            while (range <= N){
                range = range + (6 * count);
                count++;
            }
            System.out.print(count);
        }

    }

}
