import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		int inputNum = Integer.parseInt(br.readLine());
		
		for (int i=0; i<inputNum; i++) {
			
			String[] inputStr = br.readLine().split(" ");
			switch (inputStr[0]){
				case "push_front" :
					int val = Integer.parseInt(inputStr[1]);
					deque.addFirst(val);
					break;
				case "push_back" :
					int val2 = Integer.parseInt(inputStr[1]);
					deque.addLast(val2);
					break;
				case "pop_front" :
					if (deque.size() == 0) {
						System.out.println(-1);
					}
					else {
						
						System.out.println(deque.pollFirst());
					}
					break;
				case "pop_back" :
					if (deque.size() == 0) {
						System.out.println(-1);
					}
					else {
						System.out.println(deque.pollLast());
					}
					break;
				case "size" :
					System.out.println(deque.size());
					break;
				case "empty" :
					if (deque.size() == 0) {
						System.out.println(1);
					}
					else {
						System.out.println(0);
					}
					break;
				case "front" :
					if (deque.size() == 0) {
						System.out.println(-1);
					}
					else {
						System.out.println(deque.getFirst());
					}
					break;
				case "back" :
					if (deque.size() == 0) {
						System.out.println(-1);
					}
					else {
						System.out.println(deque.getLast());
					}
					
			
				
			}
			
		}
			
		
			
		
		br.close();
		bw.close();
		
		
	}
}
