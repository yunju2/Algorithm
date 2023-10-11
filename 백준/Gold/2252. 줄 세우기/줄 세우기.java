import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main {
    static int n;
    static int m;
    static List<List<Integer>> graph = new ArrayList<>();
    private static void topological_sort(List<List<Integer>> graph,int [] indegree){

        Queue<Integer> q = new LinkedList<>(); 
        for(int i =1; i<=n; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int cur = q.poll();
            System.out.print(cur+ " ");

            List<Integer> list = graph.get(cur); 
            for(int i = 0; i<list.size(); i++){
                int index = list.get(i);
                indegree[index]--;

                if(indegree[index] == 0){ 
                    q.offer(index);
                }
            }

        }

    }

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int [] indegree = new int[n+1];

        for(int i = 0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i =0 ; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            indegree[b] +=1;
        }

        topological_sort(graph,indegree);


    }




}


