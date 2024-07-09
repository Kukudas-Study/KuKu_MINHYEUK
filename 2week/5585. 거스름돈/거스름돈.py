#입력받은 값에서 거스름돈으로 변환
money = 1000 - int(input())
count = 0
while True:
    if money>=500:
        count = count+1
        money = money-500
    elif money>=100:
        count = count+1
        money = money-100
    elif money>=50:
        count = count+1
        money = money-50
    elif money>=10:
        count = count+1
        money = money-10
    elif money>=5:
        count = count+1
        money = money-5
    elif money>=1:
        count = count+1
        money = money-1
    else:
        print(count)
        break
               