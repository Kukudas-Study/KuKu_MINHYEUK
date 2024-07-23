import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int inputNum = 0;
        int answer = 0;
        
        try {
            inputNum = sc.nextInt();
            answer = sc.nextInt();
        } catch (Exception e) {
            System.out.println("입력이 올바르지 않습니다: " + e.getMessage());
            sc.close();
            return;
        }
        
        int answerX = 0, answerY = 0;
        int count = inputNum * inputNum;
        int[][] arr1 = new int[inputNum][inputNum];
        
        sc.close();

        // 짝수
        if (inputNum % 2 == 0) {
            for (int loop = 0; loop < inputNum / 2; loop++) {
                // 세로 올라가기
                for (int i = inputNum; i > 0 + loop * 2; i--) {
                    arr1[i - 1 - loop][inputNum - 1 - loop] = count--;
                }
                // 가로 왼쪽으로
                for (int i = 1; i < inputNum - 1 - loop * 2; i++) {
                    arr1[loop][inputNum - 1 - i - loop] = count--;
                }
                // 세로 내려가기
                for (int i = inputNum; i > loop * 2; i--) {
                    arr1[inputNum - i + loop][loop] = count--;
                }
                // 가로 오른쪽으로
                for (int i = 0; i < inputNum - 2 - loop * 2; i++) {
                    arr1[inputNum - 1 - loop][i + 1 + loop] = count--;
                }
            }
        } else { // 홀수
            for (int loop = 0; loop < inputNum / 2 + 1; loop++) {
                // 세로 내려가기
                for (int i = inputNum; i > loop * 2; i--) {
                    arr1[inputNum - i + loop][loop] = count--;
                }
                // 가로 오른쪽으로
                for (int i = 0; i < inputNum - 1 - loop * 2; i++) {
                    arr1[inputNum - 1 - loop][i + 1 + loop] = count--;
                }
                // 세로 올라가기
                for (int i = inputNum; i > 1 + loop * 2; i--) {
                    arr1[i - 2 - loop][inputNum - 1 - loop] = count--;
                }
                // 가로 왼쪽으로
                for (int i = 1; i < inputNum - 1 - loop * 2; i++) {
                    arr1[loop][inputNum - 1 - i - loop] = count--;
                }
            }
        }

        // 찾고자 하는 숫자의 좌표 찾기
        for (int i = 0; i < inputNum; i++) {
            for (int j = 0; j < inputNum; j++) {
                if (arr1[i][j] == answer) {
                    answerX = i + 1;
                    answerY = j + 1;
                    break;
                }
            }
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputNum; i++) {
            for (int j = 0; j < inputNum; j++) {
                sb.append(arr1[i][j]).append(" ");
            }
            sb.append("\n");
        }
        sb.append(answerX).append(" ").append(answerY);

        System.out.println(sb.toString());
    }
}
