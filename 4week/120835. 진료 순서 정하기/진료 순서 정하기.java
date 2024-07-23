import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] newArr = new int[emergency.length];
		
		for (int i=0; i<emergency.length; i++) {
			newArr[i] = emergency[i];
		}
        
        Arrays.sort(newArr);
        // int[] newArr = emergency 를 한 후에 Arrays.sort(newArr)을 하면 emergency도 정렬이 되는가?
		
		
 		for (int i=0; i<emergency.length; i++) {
 			for (int j=0; j<emergency.length; j++) {
 				if(newArr[i]==emergency[j]) {
 					answer[j] = emergency.length-i;
 					break;
 					
 				}
 			}
			
			
		}

        
        return answer;
    }
}