import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력 받기
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		sc.close();
		
		for (int i = 0; i < (inputStr.length() - 1); i++) {

			if (inputStr.charAt(i) != inputStr.charAt(inputStr.length()-i-1)) {

				System.out.println(0);
				return;

			}

			

		}
		
		System.out.println(1);
	}

}
