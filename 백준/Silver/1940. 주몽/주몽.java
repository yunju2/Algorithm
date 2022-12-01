import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static int twopointer(int n, int m, int arr []){
        int answer = 0;
        int start = 0, end;

       while(start<n){
           int sum =0;
           end = start;
           sum+=arr[start++];
           while(++end <n){
               sum += arr[end];
               if(sum == m){
                   answer++;
               }
               sum-=arr[end];
           }

       }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i =0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(twopointer(n,m, arr));

    }
}


