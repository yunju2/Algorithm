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

        Queue<int []> q = new LinkedList<>();

        visited[0][0] = true;
        q.offer(new int[] {0,0});

        while(!q.isEmpty()){
            int [] p = q.poll();
            int px = p[0];
            int py = p[1];

            for(int dir = 0; dir<4; dir++){
                int nextX = px + dx[dir];
                int nextY = py + dy[dir];
                if(nextX<0 || nextY <0 || nextX>=n || nextY >=m ) continue;
                if(visited[nextX][nextY] || board[nextX][nextY] != 1) continue;

                q.offer(new int[] {nextX,nextY});
                board[nextX][nextY] = board[px][py]+1;
                visited[nextX][nextY] = true;

            }
        }

        sb.append(board[n-1][m-1]);

        return sb.toString();

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());

        board = new int[n][m];

        boolean [][] visited = new boolean[n][m];

        for(int i = 0; i<n; i++){
            String str = br.readLine();
           for(int j = 0 ; j<m;j++){
                board[i][j] = str.charAt(j) - '0';
           }
        }


        System.out.println(bfs(board,visited));


    }

}