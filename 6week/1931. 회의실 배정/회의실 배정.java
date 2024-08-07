import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		int maxNum = 0;
		int n = Integer.parseInt(br.readLine());
		int[][] numArr = new int[n][2];

		for (int i = 0; i < n; i++) {

			String[] inputNum = br.readLine().split(" ");
			int x = Integer.parseInt(inputNum[0]);
			int y = Integer.parseInt(inputNum[1]);

			if (maxNum < y)
				maxNum = y;

			numArr[i][0] = x;
			numArr[i][1] = y;

		}

		Arrays.sort(numArr, (o1, o2) -> {
            
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0]; // 종료시간이 같을 경우 시작시간 기준으로 정렬
            }
            return o1[1] - o2[1]; // 두번째 숫자 기준 오름차순
		});

//		int[] allNumArr = new int[maxNum + 1];
//		int count = 0;

		// 회의 배열을 순회하면서 가능한 회의의 수를 세기
//		for (int i = 0; i < n; i++) {
//			int start = numArr[i][0];
//			int end = numArr[i][1];
//			boolean canSchedule = true;
//
//			for (int t = start; t < end; t++) {
//				if (allNumArr[t] == 1) {
//					canSchedule = false;
//					break;
//				}
//			}
//
//			if (canSchedule) {
//				for (int t = start; t < end; t++) {
//					allNumArr[t] = 1;
//				}
//				result++;
//			}
//		}

		int lastEndTime = 0;


        // 최대 회의 수 세기
        for (int i = 0; i < n; i++) {
            int start = numArr[i][0];
            int end = numArr[i][1];
            if (start >= lastEndTime) {
                result++;
                lastEndTime = end;
            }
        }

		System.out.println(result);

	}

}
