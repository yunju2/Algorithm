import java.io.IOException;
import java.util.Scanner;


public class Main {

    public String soultion(String str){
        String answer = "";

        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
              answer +=Character.toUpperCase(x);
            }
            if(Character.isUpperCase(x)){
                answer+=Character.toLowerCase(x);
            }
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Main t = new Main();
        System.out.println(t.soultion(str));
    }

}

