import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;
        int fakeA = 0;
        int fakeB = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        // 1. 9명의 난쟁이 키의 합을 구한다.
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // 2. 전체 합 - 스파이 2명의 난쟁이 키의 합 = 100
        int height = sum - 100;
        loop:
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == height) {
                    fakeA = i;
                    fakeB = j;

                    break loop;
                }
            }

        }

        for(int i = 0; i<arr.length;i++){
            if(i ==fakeA || i == fakeB){
              continue;
            } else{
                System.out.println(arr[i]);
            }
        }
    }
}