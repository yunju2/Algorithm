import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        int e = 1, s = 1 , m =1;
        int year = 1;
        while(true){
            if(e==E && s==S && m==M){
                break;
            }
            e+=1;
            s+=1;
            m+=1;

            if(e==16){
                e=1;
            }
            if(s==29){
                s=1;
            }
            if(m==20){
                m=1;
            }
            year++;
        }

        System.out.println(year);

    }
}