package algorithms;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArraySmallestThreeFinderTest {
	
	@Test
	public void testFindSmallestThree() {
		int[] arr = {5, 1, 2, 7, 11, 3, 9, 4, 19};
		assertThat(new ArraySmallestThreeFinder().findSmallestThree(arr)).isEqualTo(new int[] {1, 2, 3});
	}
}
