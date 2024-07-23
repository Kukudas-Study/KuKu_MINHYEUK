class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String orderStr = Integer.toString(order);
        for (int i=0; i<orderStr.length(); i++){
            char compStr = orderStr.charAt(i);
            if (compStr=='3'){
                answer++;
            }
            
              if (compStr=='6'){
                answer++;
            }
            
              if (compStr=='9'){
                answer++;
            }
        }
        
        return answer;
    }
}