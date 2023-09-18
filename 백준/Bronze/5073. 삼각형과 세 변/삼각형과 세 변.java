import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int [] arr = new int [3];


        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());


            if(arr[0] == 0 && arr[1] == 0 && arr[2] ==0) break;
            int max = Integer.MIN_VALUE;
            for(int i : arr){
                if(max<i) max = i;
            }

            if(arr[0] == arr[1] && arr[1] == arr[2]) System.out.println("Equilateral");
            else if (max >= arr[0] + arr[1] || max >= arr[1] + arr[2] || max >= arr[0] + arr[2]) System.out.println("Invalid");
            else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2] ) System.out.println("Isosceles");
            else if(max < arr[0] + arr[1] && max < arr[1] + arr[2] && max < arr[0] + arr[2]) System.out.println("Scalene");
            else System.out.println("Invalid");

        }

    }

}