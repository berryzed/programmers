package sort.level1;

import sort.level1.Lessons42748;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lessons42748Test {
	@Test
	void case1() {
		Lessons42748 s = new Lessons42748();
		Assertions.assertArrayEquals(
				new int[]{5, 6, 3},
				s.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
	}

	@Test
	void case2() {
		Lessons42748 s = new Lessons42748();
		Assertions.assertArrayEquals(
				new int[]{5, 6, 3},
				s.solution2(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
	}
}
