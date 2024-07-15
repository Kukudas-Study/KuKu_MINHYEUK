import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int maxX = 0;
		int maxY = 0;
		int[][] inputArr = new int[9][9];
		
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				
				inputArr[i][j] = sc.nextInt();
				if (inputArr[i][j]>=max) {
					max = inputArr[i][j];
					maxX = j+1;
					maxY = i+1;
				}
				
			}
		}
		sc.close();
		System.out.println(max);
		System.out.print(maxY + " " + maxX);
		

	}

}
