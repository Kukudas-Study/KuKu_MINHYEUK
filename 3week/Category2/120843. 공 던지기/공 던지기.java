class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        // k = k-1
        k = k-1;
		// 배열의 길이가 짝수일때
		
		// numbers[2*k %numbers.length] 
		answer = numbers[2*k%numbers.length];
		// 배열의 길이가 홀수일때
		
		// numbers[2*k %numbers.length]
		
        
        
        return answer;
    }
}