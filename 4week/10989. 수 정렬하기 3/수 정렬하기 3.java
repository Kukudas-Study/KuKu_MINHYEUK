import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] inputArr = new int[10001];
		
		for(int i=0; i<N; i++) {
			int inputNum = Integer.parseInt(br.readLine());
			inputArr[inputNum-1]++;
		}
		
		
		for (int i=0; i<10000; i++) {
			
			while(inputArr[i]>0) {
				bw.write(i+1 + "\n");
				inputArr[i]--;
				
			}
			
		}
     
       bw.flush();
        bw.close();
        br.close();
     

	}

}
