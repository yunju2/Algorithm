
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static int Solution(Integer [] arr, int k ){

        int answer = 0;

        for(int i = 0; i<arr.length; i++){
            if(k>=arr[i]){
                answer += k / arr[i];
                k = k % arr[i];
            }

            if(k == 0) break;
        }

        return answer;

    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer [] arr = new Integer[n];

        for(int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr,Collections.reverseOrder());


        System.out.println(Solution(arr,k));


    }
}