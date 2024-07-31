import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] inputArr = new int[100][100];
		int result = 0;
		int inputNum = Integer.parseInt(br.readLine());
		for(int i=0; i<inputNum; i++) {
			
			String[] inputXY = br.readLine().split(" ");
			int inputX = Integer.parseInt(inputXY[0]);
			int inputY = Integer.parseInt(inputXY[1]);
			for (int j=0; j<10; j++) {
				for (int k=0; k<10; k++) {
					inputArr[inputX+j][inputY+k] = 1;
				}
			}
			
			
		}
		
		for(int i=0; i<100; i++) {
			for (int j=0; j<100; j++) {
				
				if(inputArr[i][j]==0)
				{
					result++;
				}
			}
		}
		
		result = 10000-result;

		bw.write(result+"\n");
		
		br.close();
		bw.close();
		
	}

}
