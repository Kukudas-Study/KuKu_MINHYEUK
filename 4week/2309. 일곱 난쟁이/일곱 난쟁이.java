import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] inputArr = new int[9];
		int result = 0;
		int[] resultArr = new int[7];
		int sum = 0;
		for (int i=0; i<9; i++) {
			inputArr[i] = sc.nextInt();
			sum += inputArr[i];
		}
        
        sc.close();
		
		loop:
		// 총 키의 합에서 2명의 키를 빼서 100이 맞으면 그 외의 사람만 출력하면됨.
		for (int i=0; i<9; i++) {
			for (int j=i+1; j<9; j++) {
				if (sum-100==inputArr[i]+inputArr[j]) {
					for(int k=0; k<9; k++) {
						if(k!=i&&k!=j) {
							resultArr[result]=inputArr[k];
							result++;
						}

					}
                    break loop;
				}
				
			}
		}
		Arrays.sort(resultArr);
        for (int i=0; i<7; i++){
            System.out.println(resultArr[i]);
        }
		
		
	}

}
