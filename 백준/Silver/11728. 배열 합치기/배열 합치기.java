import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int size = n+m;

        int[] result=new int[size];

        String[] arrayA=br.readLine().split(" ");
        String[] arrayB=br.readLine().split(" ");

//        int a = 0, b=0;
//        for(int i =0; i<size; i++){
//            if(b == m) result[i] = Integer.parseInt(arrayA[a++]);
//            else if(a == n) result[i] = Integer.parseInt(arrayB[b++]);
//            else if(Integer.parseInt(arrayA[a]) <= Integer.parseInt(arrayB[b]))
//                result[i] = Integer.parseInt(arrayA[a++]);
//            else result[i] = Integer.parseInt(arrayB[b++]);
//        }
//        for(int x : result){
//            System.out.print(x+" ");
//        }
        int idx=0;
        for(int i=0;i<n;i++) { // 배열 A 넣기
            result[idx++]=Integer.parseInt(arrayA[i]);
        }
        for(int i=0;i<m;i++) { // 배열 B 넣기
            result[idx++]=Integer.parseInt(arrayB[i]);
        }
        Arrays.sort(result); // 오름차순 정렬

        for(int r:result) {
            bw.write(String.valueOf(r)+" ");
        }

        bw.flush();
        bw.close();




    }
}


