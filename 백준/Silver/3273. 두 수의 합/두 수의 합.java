import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int [] arr = new int[num];

        for(int i =0; i<num;i++){
            arr[i] = sc.nextInt();
        }

        int X = sc.nextInt();

        Map<Integer,Integer> complements = new HashMap<>();

        int answer = 0;

        for(int i = 0; i<num;i++){
            Integer complment = complements.get(arr[i]);
            if(complment != null){
                answer ++;
            }
            complements.put(X-arr[i],i);
        }

        System.out.println(answer);




    }


}
