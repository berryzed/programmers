package hash.level1;

import hash.level1.Lessons42576;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lessons42576Test {

	@Test
	void case1() {
		Lessons42576 s = new Lessons42576();
		Assertions.assertEquals("leo", s.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
		Assertions.assertEquals("vinko", s.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
		Assertions.assertEquals("mislav", s.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
	}

	@Test
	void case2() {
		Lessons42576 s = new Lessons42576();
		Assertions.assertEquals("leo", s.solution2(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
		Assertions.assertEquals("vinko", s.solution2(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
		Assertions.assertEquals("mislav", s.solution2(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
	}
}
