import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		int sum, result = 0;

		int a, b, c, d, e, f = 0;
		sc.close();

        loop:
		for (a = 0; a < 10; a++) {
			for (b = 0; b < 10; b++) {
				for (c = 0; c < 10; c++) {
					for (d = 0; d < 10; d++) {
						for (e = 0; e < 10; e++) {
							for (f = 0; f < 10; f++) {
								sum = 100001 * a + 10001 * b + 1001 * c + 101 * d + 11 * e + 2 * f;
								if (sum == inputNum) {
									result = 100000 * a + 10000 * b + 1000 * c + 100 * d + 10 * e + f;
								    break loop;
                                }
							}
						}
					}
				}
			}
		}

		System.out.println(result);

	
	}

}
