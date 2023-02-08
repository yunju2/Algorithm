import java.io.InputStreamReader;
import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        int M = moves.length;
        int N = board[0].length;
            
       while(M-->0){
           int move = moves[i] -1;

           for(int j = 0; j< N; j++){
              if(board[j][move] != 0){
                  if(stack.isEmpty()){
                      stack.push(board[j][move]);
                  }else{
                      if(stack.peek().equals(board[j][move])){
                          stack.pop();
                          answer++;
                      }else{
                          stack.push(board[j][move]);
                      }
                  }
                  board[j][move] = 0;
                  i++;
                  break;
              }
           }


       }

        
        
        return answer * 2;
    }
}