import java.util.*;


public class Main {
  
    static char [][] cookie;

    static public int get_len(int heart_x, int heart_y, char [][] arr, String pos){
        int cnt = 0;
        switch (pos){
            case "LA":
                for(int i = 1; i<heart_y;i++){
                    if(cookie[heart_x][i] == '*') cnt++;
                }
                break;
            case "RA":
                for(int i = heart_y+1; i<cookie.length;i++){
                    if(cookie[heart_x][i] == '*') cnt++;
                }
                break;
            case "Back":
                for(int i = heart_x+1; i<cookie.length; i++){
                    if(cookie[i][heart_y] == '*') cnt++;
                }

        }

        return cnt;
    }

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        cookie = new char[N+1][N+1];

        int heart_x = 0,heart_y = 0;

        for(int i = 1; i<=N; i++){
            String str = sc.next();
            for(int j = 1; j<=N; j++){
                cookie[i][j] = str.charAt(j-1);
                //heart 구하기
                if(cookie[i][j] == '*' && heart_x == 0 && heart_y == 0){
                    heart_x = i+1;
                    heart_y = j;
                }
            }
        }
        //왼쪽 팔
        int left_arm = get_len(heart_x,heart_y,cookie,"LA");
        //오른쪽 팔
        int right_arm = get_len(heart_x,heart_y,cookie,"RA");
        //허리
        int back_len = get_len(heart_x,heart_y,cookie,"Back");
        //왼쪽 다리
        int ll_len = 0;
        for(int i = heart_x + back_len +1; i<=N; i++){
            for(int j = 1; j<heart_y; j++){
                if(cookie[i][j] == '*') ll_len++;
            }
        }

        //오른쪽 다리
        int rl_len = 0;
        for(int i = heart_x + back_len +1; i<=N; i++){
            for(int j = heart_y+1; j<=N; j++){
                if(cookie[i][j] == '*') rl_len++;
            }
        }

        sb.append(heart_x + " ").append(heart_y + " ").append("\n").append(left_arm+  " ").append(right_arm + " ")
                .append(back_len + " ").append(ll_len + " ").append(rl_len + " ");

        System.out.println(sb);





    }
}