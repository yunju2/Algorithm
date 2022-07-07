import java.io.IOException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char [] c_a = a.toCharArray();
        char [] c_b = b.toCharArray();
        int Min = 0;
        int MAX = 0;

        int sum = Integer.parseInt(a)+Integer.parseInt(b);

        int f_sum = Integer.parseInt(changeTofive(c_a))+ Integer.parseInt(changeTofive(c_b));

        int s_sum = Integer.parseInt(changeTosix(c_a))+ Integer.parseInt(changeTosix(c_b));

        MAX = (sum>f_sum)&&(sum>s_sum)?sum:(Math.max(f_sum, s_sum));
        Min = (f_sum>sum)&&(s_sum>sum)?sum:(Math.min(f_sum, s_sum));

        System.out.print(Min+" ");
        System.out.print(MAX);


    }

    private static String changeTofive(char[] arr) {
        String str = "";
        for(int i=0; i<arr.length;i++){
            if(arr[i] == '6'){
               arr[i]='5';
            }
        }
        return str = String.valueOf(arr);
    }
    private static String changeTosix(char[] arr) {
        String str = "";
        for(int i=0; i<arr.length;i++){
            if(arr[i] == '5'){
                arr[i]='6';
            }
        }
        return str = String.valueOf(arr);
    }
}
