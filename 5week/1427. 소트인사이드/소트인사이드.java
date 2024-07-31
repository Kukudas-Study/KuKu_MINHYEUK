
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String nStr = Integer.toString(n);
		String[] nArr = nStr.split("");

	    sc.close();

		Arrays.sort(nArr);

		for (int i = 0; i < nStr.length(); i++) {
			System.out.print(nArr[nStr.length()-i-1]);
		}

	}

}
