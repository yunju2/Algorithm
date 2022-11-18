import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        int [] arr = new int[num];

        st = new StringTokenizer(br.readLine()," ");
        for(int i =0; i<num;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int sum = 0;
        int tmp = 0;
        for(int i = 0; i<num;i++){
            tmp += arr[i];
            sum+=tmp;
        }


        System.out.println(sum);



    }
}


