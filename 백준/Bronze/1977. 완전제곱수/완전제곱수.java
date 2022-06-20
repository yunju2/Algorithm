import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;

        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 1; i <= 100; i++){
            int mul = i *i;
            if(mul >= start && mul <= end){
                sum += mul;
                list.add(mul);
                
            }
        }

        if(list.size() == 0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(list.get(0));
            
        }

    }
}

