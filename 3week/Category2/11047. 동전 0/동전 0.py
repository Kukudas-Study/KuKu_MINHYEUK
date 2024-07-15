N, K = map(int, input().split())
result = 0
A = []
for i in range (N):
    A.append(int(input()))
   
for j in range (N-1, -1, -1):
    cnt = K//A[j]
    if cnt != 0:
        K = K-cnt*A[j]
        result += cnt

print(result)
        
        