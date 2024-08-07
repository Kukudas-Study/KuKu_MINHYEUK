import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] inputArr = br.readLine().split("");
		int count = 0;
		String result = "";

		loop: for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i].equals("X")) {
				count++;
			} else if (inputArr[i].equals(".")) {
				if (count % 2 != 0) {
					System.out.println(-1);
					break loop;
				} else {
					int loopA = count / 4;
					for (int j = 0; j < loopA; j++) {

						result += "AAAA";
					}
					int loopB = (count % 4) / 2;
					for (int j = 0; j < loopB; j++) {

						result += "BB";
					}

					result += ".";

				}
				count = 0;

			}

			if (i == inputArr.length - 1) {
				if (count % 2 != 0) {
					System.out.println(-1);
					break loop;
				} else {
					int loopA = count / 4;
					for (int j = 0; j < loopA; j++) {

						result += "AAAA";
					}
					int loopB = (count % 4) / 2;
					for (int j = 0; j < loopB; j++) {

						result += "BB";
					}
				}
				System.out.println(result);
			}
		}

		br.close();
		bw.close();

	}

}
