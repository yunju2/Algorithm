
class Solution {
    public int solution(int number, int limit, int power) {
       
  int answer = 0;

        for(int i = 1; i<=number; i++){
            int result = Num(i);
            if(result > limit){
                answer += power;
            } else{
                answer += result;
            }
        }


        return answer;

    }
    static int Num (int n ){

         int cnt = 0;
        int sqrt = (int)Math.sqrt(n);
        for(int j = 1; j<=sqrt; j++) {
            if (n % j == 0) {
                cnt++;

                if (j * j < n) {
                    cnt++;
                }
            }
        }
       
        return cnt;
    }
}