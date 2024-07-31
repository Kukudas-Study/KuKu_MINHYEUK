import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int count = 1;
        for (int i=1; i<arr.length; i++){
        
            if (arr[i]==arr[i-1]){
                continue;
            }
            
            count++;
            
            
        }
        
        int[] answer = new int[count];
        answer[0] = arr[0];
        
            count = 1;
        for (int i=1; i<arr.length; i++){
        
            if (arr[i]==arr[i-1]){
                continue;
            }
            
            answer[count] = arr[i];
            count++;
            
            
        }
        
        
        

        return answer;
    }
}