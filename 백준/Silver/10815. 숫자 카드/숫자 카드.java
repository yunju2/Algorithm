import java.io.*;

import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static int binarySearch(int tmp, int n []){
        int l = 0, r =n.length-1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (tmp == n[mid]) {
                return 1;
            } else if (tmp < n[mid]) {
                r = mid-1;
            } else{
                l = mid+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] N = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            N[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(N);

        StringBuilder stringBuilder = new StringBuilder();

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<m; i++){
            int tmp = Integer.parseInt(st.nextToken());
            stringBuilder.append(binarySearch(tmp, N)+ " ");
        }
        bw.write(stringBuilder.toString()+"\n");
        bw.flush();
        bw.close();
        br.close();



    }
}


