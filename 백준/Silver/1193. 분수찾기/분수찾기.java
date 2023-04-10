
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //입력값
        int crossLine = 1; // 대각선 초기값
        int preCrossLine = 0; //대각선 누적값

        while(true){
            if(num <= crossLine + preCrossLine){
                int tmp = num - preCrossLine;
                if(crossLine % 2 == 0){
                    System.out.println(tmp+"/"+(crossLine+1-tmp));
                    break;
                } else {
                    System.out.println((crossLine+1-tmp)+"/"+tmp);
                    break;
                }

            }else{
                preCrossLine += crossLine;
                crossLine++;
            }




        }

    }
}


