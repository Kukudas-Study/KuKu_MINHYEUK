import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//입력 받기
		Scanner sc = new Scanner(System.in);
		int inputX = sc.nextInt();
		int inputY = sc.nextInt();
		
		if (inputX >0)
		{
			if (inputY >0)
			{
				
				System.out.println(1);
			}
			
			else {
				System.out.println(4);
			}
			
		}
		
		else {
			
			if( inputY>0) {
				
				System.out.println(2);
			}
			
			else {
				System.out.println(3);
			}
		}
		
		sc.close();
		
		
	}

}
