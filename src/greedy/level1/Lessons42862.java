package greedy.level1;

/**
 * - 문제 설명
 * 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다.
 * 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
 * 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
 * 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
 * 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
 * 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
 * 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
 * - 제한 사항
 * 전체 학생의 수는 2명 이상 30명 이하입니다.
 * 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
 * 여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
 * 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
 * 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며,
 * 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
 * - 입출력 예
 * n = 5 / 5 / 3
 * lost = [2, 4] / [2, 4] / [3]
 * reserve = [1, 3, 5] / [3] / [1]
 * return = 5 / 4 / 2
 */
public class Lessons42862 {

	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int[] student = new int[n];

		// 전체적으로 1벌 씩 가지고 있는 상태
		for (int i = 0; i < student.length; i++) student[i] = 1;

		// 여벌 옷 카운트
		for (int i : reserve) student[i - 1]++;

		// 도둑 맞음
		for (int i : lost) student[i - 1]--;

		// 옷이 2벌 이상인 사람들 중에서 빌려준다.
		for (int i = 0; i < student.length; i++) {
			if (student[i] < 2) continue;

			int forward = i - 1;
			int backward = i + 1;
			if (forward >= 0 && student[forward] == 0) {
				student[forward]++;
			} else if (backward < student.length && student[backward] == 0) {
				student[backward]++;
			}
			student[i]--;
		}

		// 참여 가능 수
		for (int i : student) {
			if (i > 0) answer++;
		}
		return answer;
	}
}
