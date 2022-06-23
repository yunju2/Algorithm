import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int k = sc.nextInt();

        int tmp = 0;
        int n = 0;


        //1.p보다 작은 수로 나눈다.
        //2. 나머지가 0인 q중에 작은 수를 출력
        for(int i =1; i<=p; i++){
            if(p % i == 0){
                tmp = i;
                n++;
                if(n == k){
                    System.out.println(tmp);
                }
            }

        }
        //3. k과 n보다 크면 없으므로 0 출력
        if(n < k){
            System.out.println(0);
        }


        }
}