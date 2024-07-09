def solution(n):
    answer = ''
    
    for i in range(n):

        #짝수일경우 '수' 홀수일경우 '박'
        if i%2==0:
            answer += '수'
        else:
            answer += '박'
        
        
    return answer

