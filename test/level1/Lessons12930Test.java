package level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lessons12930Test {

	@Test
	public void case1() {
		Lessons12930 s = new Lessons12930();
		Assertions.assertEquals("TrY HeLlO WoRlD", s.solution("try hello world"));
	}

	@Test
	public void case2() {
		Lessons12930 s = new Lessons12930();
		Assertions.assertEquals("TrY HeLlO WoRlD     ", s.solution("try hello world     "));
	}

	@Test
	public void case3() {
		Lessons12930 s = new Lessons12930();
		Assertions.assertEquals("     TrY HeLlO WoRlD", s.solution("     try hello world"));
	}
}
