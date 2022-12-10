class Solution {
    public int[] solution(String my_string) {
         int[] answer = new int[my_string.length()];
            answer[0] = -1;

            for(int i =1; i<my_string.length();i++){
                for(int j = 0; j < i; j++ ){
                    if(my_string.charAt(i) == my_string.charAt(j)){
                        answer[i] = i-j;
                    } else if(my_string.charAt(i) != my_string.charAt(j) && answer[i]==0) {
                        answer[i] = -1;
                    }
                }

            }
        return answer;
    }
}