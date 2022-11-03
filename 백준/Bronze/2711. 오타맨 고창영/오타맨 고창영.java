

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


    int num =sc.nextInt();

        for(int i =0; i<num; i++){
            int point = sc.nextInt();
            String str = sc.next();
            String pre = str.substring(0,point-1);
            String suf = str.substring(point);
            System.out.println(pre+suf);
        }




        }
}


