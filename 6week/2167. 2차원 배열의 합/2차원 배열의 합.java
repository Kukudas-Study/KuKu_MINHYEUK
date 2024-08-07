import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inputStr = br.readLine().split(" ");
		int n = Integer.parseInt(inputStr[0]);
		int m = Integer.parseInt(inputStr[1]);
		
		int[][] inputArr = new int[n][m];
		
		for(int loop=0; loop<n; loop++) {
			
			String[] inputStr2 = br.readLine().split(" ");
			for (int loop2=0; loop2<m; loop2++) {
				inputArr[loop][loop2] = Integer.parseInt(inputStr2[loop2]);
				
			}
		}
		
		int k = Integer.parseInt(br.readLine());
		for(int loop=0; loop<k; loop++) {
			int result = 0;
			String[] inputStr2 = br.readLine().split(" ");
			int i = Integer.parseInt(inputStr2[0])-1;
			int j = Integer.parseInt(inputStr2[1])-1;
			int x = Integer.parseInt(inputStr2[2])-1;
			int y = Integer.parseInt(inputStr2[3])-1;
			
			for (int loop2=i; loop2<=x; loop2++) {
				for (int loop3=j; loop3<=y; loop3++) {
					
					result +=inputArr[loop2][loop3];
					
				}
			}
			
			System.out.println(result);
		}
		
		
		
		
		
		br.close();
		bw.close();
		
	}

}
