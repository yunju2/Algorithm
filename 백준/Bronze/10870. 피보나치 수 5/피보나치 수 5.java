import java.io.*;

import java.util.*;


public class Main {
    public static int fibo (int n){
        if (n == 0){
            return 0;
        }
       if(n == 1){
           return 1;
       }
    return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println( fibo(num));






    }
}


