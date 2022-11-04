import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int cnt = 0;


        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            String[] arr = str.split("");
            String[] resultArr = Arrays.stream(arr).distinct().toArray(String[]::new);
            List<String> list = new ArrayList<>();
            char prev = 0;
            int k = 0;

            for (int j = 0; j < arr.length; j++) {
                if (prev != arr[j].charAt(0)) {
                    arr[k++] = arr[j];
                    list.add(arr[j]);
                    prev = arr[j].charAt(0);

                }
            }
            Object [] listArray = list.toArray();
            if (Arrays.toString(resultArr).equals(Arrays.toString(listArray))) {
                cnt++;
            }
            list.clear();
        }

        System.out.println(cnt);
    }
}


