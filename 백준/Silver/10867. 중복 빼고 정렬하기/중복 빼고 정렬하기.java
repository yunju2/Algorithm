import java.io.*;

import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        Integer [] arr = new Integer[num];

        st = new StringTokenizer(br.readLine()," ");
        for(int i =0; i<num;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        Integer[] newArr = set.toArray(new Integer[0]);
        Arrays.sort(newArr);
        StringBuilder sb = new StringBuilder();

        for(int n : newArr){
            sb.append(n+" ");
        }

        bw.write(sb.toString()+"\n");   //버퍼에 있는 값 전부 출력
        bw.flush();   //남아있는 데이터를 모두 출력시킴
        bw.close();




    }
}


