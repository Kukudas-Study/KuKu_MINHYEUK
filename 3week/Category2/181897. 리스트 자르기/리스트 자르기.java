import java.util.Arrays;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        
        int answer [] = null;
        int a = 0;
        int b = 0;
        int c = 0;
        switch (n){
            case 1:
                b = slicer[1];
                answer = new int[b+1];
                for (int i=0; i<=b; i++){
                    answer[i] = num_list[i];
                    
                }
                break;
            case 2:
                a = slicer[0];
                answer = new int[num_list.length-a];
                for (int i=0; i+a<num_list.length; i++){
                    answer[i] = num_list[i+a];
                }
                break;
            case 3:
                a = slicer[0];
                b = slicer[1];
                answer = new int[b-a+1];
                for (int i =0; i+a<=b; i++){
                    answer[i] = num_list[i+a];
                }
                break;
                
            case 4:
                a = slicer[0];
                b = slicer[1];
                c = slicer[2];
                
                int length=(b-a)/c+1;
                answer = new int[length];
                
                int d = 0;
                for (int i =a; i<=b; i+=c){
                    answer[d++] = num_list[i];
                }
                break;
                
            default:
                break;
                
                
                
                
        }
        
        return answer;
    }
}