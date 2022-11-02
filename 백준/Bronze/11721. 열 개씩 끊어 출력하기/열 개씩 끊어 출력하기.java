import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int cnt =0;
        for(int i =s.length(); i>0; i=i-10){
            cnt = i-10;
            if(cnt<0){
                System.out.println(s);
            } else{
                String tmp = s.substring(0,10);
                System.out.println(tmp);
                s = s.substring(10);
            }



            }

        }
}


