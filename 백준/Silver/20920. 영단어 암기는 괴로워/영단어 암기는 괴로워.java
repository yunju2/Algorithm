import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class word implements Comparable<word> {

    String name;
    int value;

    public word(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public int compareTo(word o) {
        if (this.value != o.value) {
            return Integer.compare(o.value, this.value);
        } else if (this.name.length() != o.name.length()) {
            return Integer.compare(o.name.length(), this.name.length());
        }
        return this.name.compareTo(o.name);
    }

}

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> words = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            words.put(word, words.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<word> dictionary = new PriorityQueue<>();

        for (String key : words.keySet()) {
            dictionary.add(new word(key, words.get(key)));
        }

        StringBuilder sb = new StringBuilder();

        while(!dictionary.isEmpty()) {
            word w = dictionary.poll();
            if(w.name.length() >= M) {
                sb.append(w.name).append("\n");
            }
        }

        System.out.println(sb);


    }
}
