import java.io.*;

import java.util.*;


public class Main {
    public static int fact(int num){
        if(num == 1 || num == 0){
            return 1;
        }

        return num * fact(num-1);
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int answer = fact(num);
        System.out.println(answer);




    }
}


