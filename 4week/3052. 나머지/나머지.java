import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resultCount = 0;
		int inputNum = 0;
		Scanner sc = new Scanner(System.in);
		int[] inputArr = new int[10];
		int[] resultArr = new int[10];

		for (int i = 0; i < inputArr.length; i++) {
			inputNum = sc.nextInt() % 42 + 1;
			for (int j = 0; j <= i; j++) {

				if (inputArr[j] == inputNum) {
					break;

				}

				if (j == i) {
					inputArr[i] = inputNum;
				}

			}

		}

		for (int k = 0; k < inputArr.length; k++) {
			if (inputArr[k] != 0) {
				resultCount++;
			}

			sc.close();

		}
		
		System.out.println(resultCount);

	}

}