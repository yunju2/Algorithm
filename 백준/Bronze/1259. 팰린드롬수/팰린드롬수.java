
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String answer= "";

        while (true) {
            int num = sc.nextInt();
            int newNum = 0;
            if (num == 0) {
                break;
            }
            while(true){
                answer += String.valueOf(num % 10);
                num /= 10;
                if (num == 0) {
                    String rev = new StringBuilder(answer).reverse().toString();
                    if (answer.equals(rev)) {
                        System.out.println("yes");
                        answer = "";
                        break;
                    } else {
                        System.out.println("no");
                        answer = "";
                        break;
                    }
                }
            }


        }


    }
}


