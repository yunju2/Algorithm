import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int board[][];
    static int [] dx = {1,0,-1,0};
    static int [] dy = {0,1,0,-1};

    static int n;
    static int m;



    static String bfs(int[][] graph, boolean[][] visited) {

        StringBuilder sb = new StringBuilder();

        int max = 0;
        int num = 0;
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i< graph.length; i++){
            for(int j = 0; j <graph[i].length; j++){
                if(graph[i][j] == 0 || visited[i][j]) continue;
                num++;
                visited[i][j] = true;
                q.offer(new int[]{i,j});
                int area = 0;
                while(!q.isEmpty()){
                    area++;
                   int [] p = q.poll();
                   int px = p[0];
                   int py = p[1];
                   for(int dir = 0; dir<4;dir++){
                       int nx = px+dx[dir];
                       int ny = py+dy[dir];
                       if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
                       if(visited[nx][ny] || board[nx][ny] != 1) continue;
                       visited[nx][ny] = true;
                       q.offer(new int[]{nx,ny});
                   }
                }
                max = Math.max(max, area);
            }
        }

        sb.append(num+" ");
        sb.append(max);

        return sb.toString();

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());

        board = new int[n][m];

        // 방문처리를 위한 boolean배열 선언
        boolean[][] visited = new boolean[n][m];

        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
           for(int j = 0 ; j<m;j++){
                board[i][j] = Integer.parseInt(st.nextToken());
           }
        }


        System.out.println(bfs(board,visited));


    }

}