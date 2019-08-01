package algorithms;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LeetCode1108Test {
	
	@Test
	public void testDefangIpAddressHappy() {
		String ipaddress = "192.168.2.7";
		String defanged = "192[.]168[.]2[.]7";
		
		assertThat(new LeetCode1108().defangIpAddress(ipaddress)).isEqualTo(defanged);
	}

}
