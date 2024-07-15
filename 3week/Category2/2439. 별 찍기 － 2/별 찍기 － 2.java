import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력 받기
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();

		for (int i = 1; i <= inputNum; i++) {
			for (int j = 1; j <= inputNum - i; j++) {

				System.out.print(" ");

			}
			
			for (int k = 1; k<=i; k++) {

			    System.out.print("*");
			}

			System.out.println();
		}
		sc.close();

	}

}
