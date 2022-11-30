import java.io.*;


public class Main {
    public static int twoPointer(int num){
        int answer = 0;
        int start =0, end =0;
        int sum =0;

        while(start<=num){
            while(++end<=num){
                sum+=end;
            if(sum >= num) {
                if (sum == num)
                    answer++;
                break;
            } }
            while(++start<=num){
             sum -= start;
                if(sum<=num) {
                    if(sum==num) answer++;
                    break;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(twoPointer(n));



    }
}


