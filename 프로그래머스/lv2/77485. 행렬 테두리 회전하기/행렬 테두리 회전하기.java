import java.util.*;

class Solution {
     static int[][] table;
     static int minVal;


    public int[] solution(int rows, int columns, int[][] queries) {
        table = new int[rows + 1][columns + 1];
        int count = 0;

        for(int i =1; i<rows+1;i++){
            for(int j = 1; j<columns+1;j++){
                count++;
                table[i][j] = count;
            }
        }

        int [] answer = new int [queries.length];
        int i = 0;
        for(int [] q :queries){
            minVal = 10000;
            rotate(q[0],q[1],q[2],q[3]);
            answer[i++] = minVal;
        }

        return answer;
    }

    static void rotate(int x1, int y1, int x2, int y2){

        Queue<Integer> q = new LinkedList<>();

        q.offer(table[x1][y1]);
        for(int j = y1+1; j <y2; j++){ //상
            q.offer(table[x1][j]);
            table[x1][j] = q.remove();
            minVal = Math.min(minVal, table[x1][j]);
        }

        for(int j = x1; j<x2;j++){ //우
            q.offer(table[j][y2]);
            table[j][y2] = q.remove();
            minVal = Math.min(minVal, table[j][y2]);
        }

        for(int j = y2; j>y1; j--){ //하
            q.offer(table[x2][j]);
            table[x2][j] = q.remove();
            minVal = Math.min(minVal, table[x2][j]);
        }

        for(int j = x2; j>=x1;j-- ){ //좌
                q.offer(table[j][y1]);
                table[j][y1] = q.remove();
                minVal = Math.min(minVal,table[j][y1]);
        }

    }
  
}