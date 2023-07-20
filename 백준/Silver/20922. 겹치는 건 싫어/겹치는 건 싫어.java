
import java.util.*;


public class Main {

    public static int soultion(int [] arr, int k, int n) {

        int answer = 0;

        int lt = 0;
        int rt = 0;
        int [] cnt = new int[100_001];


        while(lt<=rt){
            if(cnt[arr[rt]] < k && rt <= n-1){
                cnt[arr[rt]] ++;
                rt++;
            }else if(cnt[arr[rt]] == k ){
                cnt[arr[lt]] --;
                lt++;
            }
            answer = Math.max(rt-lt,answer);
            if(rt == n) break;
        }

    return answer;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int [] arr =new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(soultion(arr,k,n));


    }
}