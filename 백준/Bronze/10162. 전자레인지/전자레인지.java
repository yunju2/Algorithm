import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int btn[] ={300,60,10};
        int cnt_btn[] = {0,0,0};

        if(T%10 != 0) {
            System.out.println(-1);
            return;
        }
        for(int i=0; i<3; i++){
            cnt_btn[i] = T / btn[i];
            T -= btn[i]*cnt_btn[i];

            System.out.print(cnt_btn[i]+" ");
        }


    }
}
