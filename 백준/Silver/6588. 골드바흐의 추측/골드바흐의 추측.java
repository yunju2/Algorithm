import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            boolean [] arr = new boolean[1000001];
            Arrays.fill(arr,true);

            arr[0] = arr[1] = false;

            for(int i = 2; i <(int) Math.sqrt(1000000); i++){
                if(arr[i]){
                    for(int j = i*2; j< 1000001; j += i){
                        arr[j] = false;
                    }
                }
            }


            while(true){
                int n = Integer.parseInt(br.readLine());
                if(n == 0) break;
                boolean ans = false;
                for(int k = 2; k < n/2 +1; k++){
                    if(arr[k] && arr[n-k]){
                        System.out.println(n +" = "+ k + " + " + ( n - k));
                        ans = true;
                        break;
                    }
                }
                if (ans == false) {
                    System.out.println("Goldbach's conjecture is wrong.");
                }

            }



        }

    }
