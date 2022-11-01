
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int cnt = 1;
            int max = 1;
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) == str.charAt(j + 1)) {
                    cnt++;
                    max = Math.max(max, cnt);
                } else {
                    cnt = 1;
                }
            }
            System.out.println(max);
        }


    }
}
