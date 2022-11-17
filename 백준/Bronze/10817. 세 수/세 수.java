import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        int [] arr = new int[3];

        for(int i =0; i<3;i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        for(int i =1; i<3;i++){
         for(int j =i;j>0;j--){
             if(arr[j] < arr[j-1]){
                 int tmp = arr[j];
                 arr[j] = arr[j-1];
                 arr[j-1] = tmp;
             }
         }
        }
            System.out.println(arr[1]);





    }
}


