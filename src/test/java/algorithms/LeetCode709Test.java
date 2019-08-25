package algorithms;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class LeetCode709Test {
	
	@Test
	public void testWithValidString() {
		LeetCode709 lc = new LeetCode709();
		assertThat(lc.toLowerCase("RaKeSh")).isEqualTo("rakesh");
	}
	
	@Test(expected = NullPointerException.class)
	public void testWithNullString() {
		LeetCode709 lc = new LeetCode709();
		lc.toLowerCase(null);
	}
	
	@Test
	public void testWithLowerCaseString() {
		assertThat(new LeetCode709().toLowerCase("prajakta")).isEqualTo("prajakta");
	}

}
