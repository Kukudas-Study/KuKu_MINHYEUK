T = int(input())

for i in range (T):
    
    
    H, W, N = map(int, input().split())
    
    #층은 인원%층 * 100
    floor = N%H
    room_number = N//H+1

    #다만 인원이 층의 배수인경우 
    if (floor == 0):
        floor = 100 * H
        room_number = N//H
    else:
        floor = 100 * floor
    print(floor+room_number)
        
     
        
        
        
     
