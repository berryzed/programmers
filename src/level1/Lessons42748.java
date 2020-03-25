package level1;

import java.util.Arrays;

/**
 * - 문제 설명
 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
 * 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
 * 1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
 * 2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
 * 3. 2에서 나온 배열의 3번째 숫자는 5입니다.
 * 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
 * commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 * <p>
 * - 제한 사항
 * array의 길이는 1 이상 100 이하입니다.
 * array의 각 원소는 1 이상 100 이하입니다.
 * commands의 길이는 1 이상 50 이하입니다.
 * commands의 각 원소는 길이가 3입니다.
 * <p>
 * - 입출력 예
 * array = [1, 5, 2, 6, 3, 7, 4]
 * commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
 * return = [5, 6, 3]
 */
public class Lessons42748 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2] - 1];
		}

		return answer;
	}

	public int[] solution2(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int len = commands[i][1] - commands[i][0] + 1;
			if (len == 1) {
				answer[i] = array[commands[i][0] - 1];
				continue;
			}
			int[] temp = new int[len];
			for (int j = commands[i][0] - 1, k = 0; j < commands[i][1]; j++, k++) {
				temp[k] = array[j];
			}

			quickSort(temp, 0, len - 1);
			answer[i] = temp[commands[i][2] - 1];
		}

		return answer;
	}

	private void quickSort(int[] array, int low, int high) {
		if (low >= high) return;

		int L = low;
		int R = high;

		// 파티션
		int pivot = array[(low + high) / 2];
		while (L <= R) {
			while (array[L] < pivot) L++;
			while (array[R] > pivot) R--;
			if (L <= R) {
				int temp = array[L];
				array[L] = array[R];
				array[R] = temp;
				L++;
				R--;
			}
		}

		if (low < R) quickSort(array, low, R);
		if (high > L) quickSort(array, L, high);
	}
}
