import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 첫째 줄에는 연도가 주어진다 1~4000
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		
		
		// 윤년은 연도가 4의 배수이면서 100의배수가 아닐떄, 또는 400의 배수일떄이다.
		
		// 400의 배수가 일때 
		
		if (inputNum%400 ==0 ) {
			
			System.out.println(1);
		}
		
		else if ((inputNum%4==0) && (inputNum%100 != 0) ) {
			System.out.println(1);
		}
		
		else {
			System.out.println(0);
		}
		
		
		sc.close();
		
	}

}
