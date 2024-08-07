import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputNum = Integer.parseInt(br.readLine());
		int[] inputArr = new int[21];
		inputArr[0] = 0;
		inputArr[1] = 1;
		
		if (inputNum ==0 ) {
			System.out.println(0);
		}
		else if(inputNum == 1) {
			System.out.println(1);
		}
		
		else {
			
			for (int i=2; i<inputArr.length; i++) {
				inputArr[i] = inputArr[i-2] + inputArr[i-1];
				
			}
			System.out.println(inputArr[inputNum]);
		}
		
		
	}

}
