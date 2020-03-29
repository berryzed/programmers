package bf.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lessons42840Test {

	@Test
	void case1() {
		Lessons42840 s = new Lessons42840();

		Assertions.assertArrayEquals(new int[]{1}, s.solution(new int[]{1,2,3,4,5}));
		Assertions.assertArrayEquals(new int[]{1, 2, 3}, s.solution(new int[]{1,3,2,4,2}));
	}
}
