package algorithms;

public class LeetCode1108 {
	
	private static final String DOT = ".";
	private static final String DEFANGED_DOT = "[.]";
	
	public String defangIpAddress(String ipaddress) {
		if(ipaddress == null || ipaddress.isEmpty()
				|| !isValidInet4Address(ipaddress)) {
			throw new IllegalArgumentException("Invalid ip address");
		}
		
		return ipaddress.replace(DOT, DEFANGED_DOT);
	}
	
	private boolean isValidInet4Address(String ipaddress) {
		
		boolean result = true;
		
		if(!ipaddress.contains(DOT)) {
			return false;
		}
		
		String[] elements = ipaddress.split("\\.");
		if(elements.length != 4) {
			return false;
		}
		for (String element : elements) {
			int number = Integer.parseInt(element);
			if(!(number >= 0 && number <= 255)) {
				result = false;
				break;
			}
		}
		return result;
	}
}
