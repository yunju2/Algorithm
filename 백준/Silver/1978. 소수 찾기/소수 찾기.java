
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
    public Boolean isPrime(int num){
        Boolean bool = true;

        if(num == 1) return false;
        for(int i =2; i<num; i++){
            if(num % i == 0) return false;
        }

        return bool;
    }

    public static void main(String[] args) throws IOException {

        Main main = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int [] arr = new int[num];

        int count =0;

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<num; i++){
            arr[i] =Integer.parseInt(st.nextToken());
        }

        for(int i =0;i<arr.length; i++){
            if(main.isPrime(arr[i])){
                count++;
            }
        }
        System.out.println(count);



    }
}


