
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num =sc.nextInt();
      String [][] arr = new String[num][2];

      for(int i =0; i<num; i++){
          arr[i][0] = sc.next();
          arr[i][1] = sc.next();
      }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < num; i++) {
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        }

        System.out.println(sb);
    }
}


