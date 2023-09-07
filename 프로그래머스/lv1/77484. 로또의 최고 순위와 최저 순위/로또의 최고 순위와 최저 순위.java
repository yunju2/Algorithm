import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
      int [] sol = new int[2];

        int cnt = 0;
        int un_cnt = 0;

        int[] score = {6,6,5,4,3,2,1};

        Arrays.sort(lottos);
        Arrays.sort(win_nums);


        for(int i = 0; i<lottos.length;i++){
            if(Arrays.binarySearch(win_nums,lottos[i]) >= 0){
                cnt++;
            } else if (lottos[i] == 0) {
                un_cnt++;
            }
        }

        int Max_value = cnt+ un_cnt;
        int Min_value = cnt;

        sol[0] = score[Max_value];
        sol[1] = score[Min_value];


        return sol;
    }
}