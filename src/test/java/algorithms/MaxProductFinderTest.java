package algorithms;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class MaxProductFinderTest {
	
	@Test
	public void testWithValidArray() {
		int[] arr = {1, 5, 8, 3, 2};
		assertThat(new MaxProductFinder().findMaxProduct(arr)).isEqualTo(40);
	}
	
	@Test
	public void testWithValidArray2() {
		int[] arr = {6, 9, 4, 9, 0, 2, 1, 7};
		assertThat(new MaxProductFinder().findMaxProduct(arr)).isEqualTo(81);
	}
}
