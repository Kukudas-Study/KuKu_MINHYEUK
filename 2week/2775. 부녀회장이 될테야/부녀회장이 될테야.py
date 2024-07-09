T = int(input())
result = 0

#T번 입력 받기
for i in range(T):
    k = int(input())
    n = int(input())
    
    #빈 배열
    result = []
    for j in range(1,n+1):

        #0층 셋팅
        result.append(j)
    
    for l in range(k):
        for m in range(1, n):

            #전 값을 더해감
            result[m]=result[m] + result[m-1]
    print(result[-1])
            
            
    
    
    