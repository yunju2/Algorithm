import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static HashMap<String,Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        String game = st.nextToken();

        String [] arr = new String[N];
        for(int i = 0; i<N; i++){
            arr[i] = br.readLine();
        }

        Set<String> userSet = new HashSet<>(List.of(arr));

        if(game.equals("Y")){
            System.out.println(userSet.size());

        }else if(game.equals("F")){
            System.out.println(userSet.size()/2);

        }else if(game.equals("O")){
            System.out.println(userSet.size()/3);
        }

    }
}