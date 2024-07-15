
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력 받기
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		double maxNum = 0;
		double sum = 0;
		double[] inputArr = new double[n];
		for (int i=0; i<n; i++) {
			
			inputArr[i] = sc.nextInt();
			if (inputArr[i]>maxNum) {
				maxNum = inputArr[i];
			}
			
		}
		
		for (int j=0; j<n; j++) {
			
			inputArr[j]=(inputArr[j]/maxNum)*100.0;
			sum += inputArr[j];
		}
		
		System.out.println(sum/n);
	
	
	}

}

