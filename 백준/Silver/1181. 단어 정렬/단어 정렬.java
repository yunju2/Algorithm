import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;



public class Main {


    public static void main(String[] args) throws IOException {

        // 처음에 시간초과 뜸. n^2이 아니라 nlogn 정렬 알고리즘 써야함..

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int num = Integer.parseInt(br.readLine());
       String [] arr = new String [num];

        for(int i=0; i<num; i++){
            arr[i] = br.readLine();

        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }else {
                    return o1.length() - o2.length();
                }
            }
        });

      /*  for(int i =0; i<arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i].length()>arr[j].length()){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=tmp;
                } else if(arr[j].length() == arr[i].length()){
                     int comparedResult = arr[i].compareTo(arr[j]);
                        if (comparedResult > 0) {
                            tmp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = tmp;
                        }
                    }
                }
            }*/

        StringBuilder sb = new StringBuilder();

        sb.append(arr[0]).append('\n');

        for (int i = 1; i < num; i++) {
            // 중복되지 않는 단어만 출력
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }

}
