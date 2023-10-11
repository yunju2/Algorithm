import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int p = Integer.parseInt(br.readLine());

        while(p-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int case_cnt = Integer.parseInt(st.nextToken());
            int [] arr = new int[20];
            int cnt = 0;
            for(int i = 0; i<20; i++){
                arr[i]= Integer.parseInt(st.nextToken());
            }

            for(int j = 0; j < arr.length; j++ ){
                for(int k = 0; k < j; k++){
                    if(arr[k]>arr[j]) cnt++;
                }
            }
            System.out.println(case_cnt + " "+ cnt);

        }



    }




}


