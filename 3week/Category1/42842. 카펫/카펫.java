
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for (int y=1; y<=yellow; y++){
            
            if (yellow%y!=0){
                continue;
            }
            int x=yellow/y;
            if ((2*(x+y+2)== brown)){
                answer[0] = x+2;
                answer[1] = y+2;
                break;
            }
            else{
                continue;
            }
            
            
        }
        
        return answer;
    }
}