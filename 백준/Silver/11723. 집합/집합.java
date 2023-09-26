import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int M = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<Integer>();
        StringBuilder sb = new StringBuilder();


        while(M-->0){
            String [] command = br.readLine().split(" ");
            switch(command[0]){
                case "add":
                    set.add(Integer.parseInt(command[1]));
                    break;
                case "remove":
                    set.remove(Integer.parseInt(command[1]));
                    break;
                case "check":
                    if(set.contains(Integer.parseInt(command[1]))) sb.append("1").append('\n');
                    else sb.append("0").append('\n');
                    break;
                case "toggle":
                    if(set.contains(Integer.parseInt(command[1]))) set.remove(Integer.parseInt(command[1]));
                    else set.add(Integer.parseInt(command[1]));
                    break;
                case "all":
                    for(int num = 1; num<=20; num++){
                        set.add(num);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;

            }
        }

        System.out.println(sb.toString());

    }

}
