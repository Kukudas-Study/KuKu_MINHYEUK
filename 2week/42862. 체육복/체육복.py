def solution(n, lost, reserve):
    answer = 0
    #학생의 체육복 1로 설정
    student = [1] * n 
    
    #체육복 잃어버린 학생 -1 
    for i in lost:
        student[i-1] -= 1
    
    #여벌의 체육복 학생 +1
    for j in reserve:
        student[j-1] += 1
        
    for k in range(n):
        
        #체육복이 없는 경우
        if student[k] == 0:

            #왼쪽에 학생이 체육복을 가져온 경우            
            if k > 0 and student[k-1] == 2:
                student[k-1] = 1
                student[k] = 1
            #오른쪽에 학생이 체육복을 가져온 경우
            elif k<n-1 and student[k+1] == 2:
                student[k] = 1
                student[k+1] = 1

    #값이 1이상인 경우만 카운트
    for l in range(n):
        if student[l] >= 1:
            answer += 1

        
        

    return answer