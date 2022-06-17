
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 카드 갯수
        int n = sc.nextInt();
        // 카드의 합
        int m = sc.nextInt();
        // 카드들의 값
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int tmp = 0;
        int sum =0;

        // 1. 숫자 3개를 더한 값을 만든다.
        // 2. m이랑 제일 가까운 숫자를 비교하며 찾는다.
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] + arr[i + 1] > m) continue;

                for (int k = j + 1; k < arr.length; k++) {
                     sum = arr[i] + arr[j] + arr[k];
                    if (m >= sum && tmp < sum) {
                        tmp = sum;

                    }

                }
            }

        }

        System.out.println(tmp);
    }
}

