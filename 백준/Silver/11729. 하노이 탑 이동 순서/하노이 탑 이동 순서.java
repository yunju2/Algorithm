
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static StringBuffer sb = new StringBuffer();
    public static void Hanoi(int n , int a , int b) {

        if(n == 1){
            sb.append(a +" "+ b).append("\n");
            return;
        }
        Hanoi(n-1,a,6-a-b);
        sb.append(a +" "+ b).append("\n");;
        Hanoi(n-1,6-a-b ,b);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        sb.append((int)Math.pow(2,n)-1).append("\n");;
        Hanoi(n ,1, 3);
        System.out.println(sb);
    }
}




