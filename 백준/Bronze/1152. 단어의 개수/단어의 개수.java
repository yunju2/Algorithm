import java.util.*;


public class Main {
    public int soultion(String str){
        int answer = 0;
        String[] s=str.split(" ");
        for(String x : s){
            if(x.isEmpty()){
                answer--;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
       Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.soultion(str));

    }
}


