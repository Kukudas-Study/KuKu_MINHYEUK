import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int inputNum = Integer.parseInt(br.readLine());
        int lastNum = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < inputNum; i++) {
            String[] command = br.readLine().split(" ");
            String operation = command[0];
            
            switch (operation) {
                case "push":
                    int value = Integer.parseInt(command[1]);
                    lastNum = value;
                    queue.add(value);
                    break;
                    
                case "pop":
                    if (queue.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(queue.poll() + "\n");
                    }
                    break;
                    
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                    
                case "empty":
                    if (queue.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                    
                case "front":
                    if (queue.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(queue.peek() + "\n");
                    }
                    break;
                    
                case "back":
                    if (queue.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(lastNum + "\n");
                    }
                    break;
            }
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}
