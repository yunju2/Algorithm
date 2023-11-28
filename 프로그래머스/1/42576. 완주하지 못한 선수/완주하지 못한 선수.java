import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String,Integer> checkCompletion = new HashMap<>();
        
        for(int i = 0; i<participant.length; i++) {
            String name = participant[i];
            checkCompletion.put(name,checkCompletion.getOrDefault(name,0)+1);
        }

        for(int j = 0; j<completion.length; j++) {
           int value = checkCompletion.get(completion[j]) -1;
            checkCompletion.put(completion[j], value);
            
        }

        for(int k = 0; k < participant.length; k ++) {
            if(checkCompletion.get(participant[k]) !=0) {
                answer = participant[k];
            }
        }
            
        return answer;
    }
}