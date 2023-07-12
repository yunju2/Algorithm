
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;



public class Main {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i = 0; i<n; i++){
            q.add(i+1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

           while(q.size() != 1){
               for(int j = 0; j<k-1; j++){
                   int tmp = q.peek();
                   q.offer(tmp);
                   q.remove();
               }
               sb.append(q.peek() + ", ");
               q.remove();
           }
        sb.append(q.peek());
        sb.append('>');

        System.out.println(sb);
    }

}
