import java.util.Arrays;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int max = board.length;
        int[][] answerArr = new int[max][max];
        
        if (max==1){
            if(board[0][0]==1){
                return answer;
            }
            else{
                return ++answer;
            }
        }    
        for(int i =0 ; i<max; i++){
            for(int j=0; j<max; j++){
                if(board[i][j]==1){
                    
                    if(i==0){
                        
                        if(j==0){
                            
                        answerArr[i][j] =1;
                        answerArr[i+1][j] =1;
                        answerArr[i][j+1] =1;
                        answerArr[i+1][j+1] =1;
                        }
                        
                        else if(j==max-1){
                        answerArr[i][j] =1;
                        answerArr[i+1][j] =1;
                        answerArr[i][j-1] =1;
                        answerArr[i+1][j-1] =1;

                        }
                        else{
                        answerArr[i][j] =1;
                        answerArr[i][j-1] =1;
                        answerArr[i][j+1] =1;
                        answerArr[i+1][j] =1;
                        answerArr[i+1][j+1] =1;
                        answerArr[i+1][j-1] =1;
                        }
                        
                    } else if(i==max-1){
                        
                        if(j==0){
                            
                        answerArr[i][j] =1;
                        answerArr[i-1][j] =1;
                        answerArr[i][j+1] =1;
                        answerArr[i-1][j+1] =1;
                        }
                        
                        else if(j==max-1){
                        answerArr[i][j] =1;
                        answerArr[i-1][j] =1;
                        answerArr[i][j-1] =1;
                        answerArr[i-1][j-1] =1;

                        }
                        else{
                        answerArr[i][j] =1;
                        answerArr[i][j-1] =1;
                        answerArr[i][j+1] =1;
                        answerArr[i-1][j] =1;
                        answerArr[i-1][j+1] =1;
                        answerArr[i-1][j-1] =1;
                        }
                        
                        
                    } 
                    else{
                        
                        if(j==0){
                            
                        answerArr[i][j] =1;
                        answerArr[i+1][j] =1;
                        answerArr[i-1][j] =1;
                        answerArr[i][j+1] =1;
                        answerArr[i-1][j+1] =1;
                        answerArr[i+1][j+1] =1;
                        }
                        
                        else if(j==max-1){
                        answerArr[i][j] =1;
                        answerArr[i-1][j] =1;
                        answerArr[i+1][j] =1;
                        answerArr[i][j-1] =1;
                        answerArr[i-1][j-1] =1;
                        answerArr[i+1][j-1] =1;

                        }
                        else{
                        answerArr[i][j] =1;
                        answerArr[i][j-1] =1;
                        answerArr[i][j+1] =1;
                        answerArr[i-1][j] =1;
                        answerArr[i-1][j+1] =1;
                        answerArr[i-1][j-1] =1;
                        answerArr[i+1][j] =1;
                        answerArr[i+1][j+1] =1;
                        answerArr[i+1][j-1] =1;
                        }
                        
                        
                    }
                    
                    
                    
                }
            }
        }
        for(int i =0 ; i<max; i++){
            for(int j=0; j<max; j++){
                if(answerArr[i][j]==0){
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}