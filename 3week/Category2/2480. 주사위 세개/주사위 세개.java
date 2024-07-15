import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = 0;
		// 입력을 3개를 받는다
		Scanner sc = new Scanner(System.in);
		String[] inputNum = sc.nextLine().split(" ");
		int[] numArr = new int[3];
		
		// int 배열에 저장
		for (int i=0; i<3; i++) {
			numArr[i] = Integer.valueOf(inputNum[i]);
		}

		// 같은 눈이 3개가 나오는 경우
		if (numArr[0] == numArr[1] && numArr[1] == numArr[2]) {
			result = 10000+numArr[0]*1000;

		} 
		
		// 같은 눈이 2개만 나오는 경우 
		else {
			
			if ((numArr[0] == numArr[1]) || (numArr[0] == numArr[2])) {
				
				result = 1000+numArr[0]*100;
			}
			else if (numArr[1] == numArr[2]) { 
							result = 1000+numArr[1]*100;
			
						
			}
			
			else {
				
				if(numArr[0]< numArr[1]) {
					
					if (numArr[1] < numArr[2]) {
						result = numArr[2]*100;
					}
					
					else {
						result = numArr[1]*100;
					}
					
				}
				
				else {
					
					if (numArr[0]< numArr[2]) {
						result = numArr[2]*100;
					}
					
					else {
						result = numArr[0]*100;
					}
				}
			}
			
		}
		
		sc.close();
		System.out.println(result);
	}

}
