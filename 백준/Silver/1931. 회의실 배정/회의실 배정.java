
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static int Solution(int [][] arr){

        int answer = 0;

        int end_time = 0;


        for(int j = 0; j < arr.length; j++){
            if(end_time <=arr[j][0]){
                end_time = arr[j][1];
                answer++;
            }
        }

        return answer;

    }



    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [][] arr = new int[n][2];

        for(int i = 0; i<n;i++){
            arr[i][0] =  sc.nextInt();
            arr[i][1] =  sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                //끝나는 시간이 동일하다면 시작시간이 빠른 순으로 배치 ex) (2,2) (1,2)
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                 return o1[1]-o2[1];
            }
        });

        System.out.println(Solution(arr));


    }
}