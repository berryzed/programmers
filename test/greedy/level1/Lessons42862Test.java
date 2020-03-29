package greedy.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lessons42862Test {
	@Test
	void case1() {
		Lessons42862 s = new Lessons42862();
		Assertions.assertEquals(5, s.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
		Assertions.assertEquals(4, s.solution(5, new int[]{2, 4}, new int[]{3}));
		Assertions.assertEquals(2, s.solution(3, new int[]{3}, new int[]{1}));
	}
}
