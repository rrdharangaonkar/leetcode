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
	
	@Test(expected = IllegalArgumentException.class)
	public void testDefangIpAddressNull() {
		String ipaddress = null;
		new LeetCode1108().defangIpAddress(ipaddress);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDefangIpAddressEmpty() {
		String ipaddress = "";
		new LeetCode1108().defangIpAddress(ipaddress);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDefangIpAddressInvalid() {
		String ipaddress = "67.90.12";
		new LeetCode1108().defangIpAddress(ipaddress);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDefangIpAddressInvalid_2() {
		String ipaddress = "abc.90.89";
		new LeetCode1108().defangIpAddress(ipaddress);
	}
}
