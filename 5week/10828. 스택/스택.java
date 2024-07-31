import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> stack = new Stack<>();
		
		int inputNum = Integer.parseInt(br.readLine());
		
		for(int i=0; i<inputNum; i++) {
			
			String[] inputStr= br.readLine().split(" ");
			switch(inputStr[0]) {
				case "push":
					stack.push(Integer.parseInt(inputStr[1]));
					break;
				case "pop":
					if(stack.size()==0) {
						System.out.println(-1);
					}
					
					else {
						
						System.out.println(stack.pop());
					}
					break;
					
				case "size":
					System.out.println(stack.size());
					break;
					
				case "empty":
					if(stack.size()==0) {
						System.out.println(1);
					}
					else {
						System.out.println(0);
					}
					break;
					
				case "top":
					if(stack.size()==0) {
						System.out.println(-1);
					}
					else {
						
						System.out.println(stack.lastElement());
					}
					break;
					
					
			
			}
			
			
			
			
			
			
		}
		
		br.close();
		bw.close();
		
		
	}
}
