import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int[] aArr = {1,2,3,4,5};
        int[] bArr = {2,1,2,3,2,4,2,5};
        int[] cArr = {3,3,1,1,2,2,4,4,5,5};
        
        
        for (int i =0; i<answers.length; i++){
            
            if(aArr[i%aArr.length]==answers[i]){
                aCount++;
            }
            if(bArr[i%bArr.length]==answers[i]){
                bCount++;
            }
            
            if(cArr[i%cArr.length]==answers[i]){
                cCount++;
            }
        }
        
         int max = Math.max(aCount, Math.max(bCount, cCount));
        
        List<Integer> resultList = new ArrayList<>();
        if (max == aCount) {
            resultList.add(1);
        }
        if (max == bCount) {
            resultList.add(2);
        }
        if (max == cCount) {
            resultList.add(3);
        }
        
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}