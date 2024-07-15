
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력 받기
		Scanner sc = new Scanner(System.in);
		int maxNum = 0;
		int maxNumIdx = 0;
		int[] inputArr = new int[9];
		for(int i=0; i<9; i++) {
			
			inputArr[i] = sc.nextInt();
			if (inputArr[i]>maxNum) {
				maxNum = inputArr[i];
				maxNumIdx = i+1;
			}
			
				
			
		}
		
		System.out.println(maxNum);
		System.out.println(maxNumIdx);

	}

}

