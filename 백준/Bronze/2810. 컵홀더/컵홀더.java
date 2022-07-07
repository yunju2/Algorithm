import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String [] seat = sc.nextLine().split("");
        int sum = 1;

        for(int i =0; i<seat.length; i++){
            if(seat[i].equals("S")){
                sum++;
            }
            if(seat[i].equals("L")){
                i++;
                sum++;
            }
        }

        if(sum>num){
            System.out.println(num);
        }else{
            System.out.println(sum);
        }





    }

}