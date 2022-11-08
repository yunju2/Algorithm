import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for(Integer num : list){
            sb.append(num);
        }
        System.out.println(sb.toString());


    }
}


