
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num];
        int[] b = new int[num];
        int sum = 0;

        for (int i = 0; i < num; i++) a[i] = sc.nextInt();
        for (int i = 0; i < num; i++) b[i] = sc.nextInt();

        Arrays.sort(a);
        Arrays.sort(b);

        for (int j = 0; j < num; j++) {
            sum += a[j] * b[num - 1 - j];
        }

        System.out.println(sum);


    }
}


