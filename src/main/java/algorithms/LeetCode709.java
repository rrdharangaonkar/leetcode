package algorithms;

public class LeetCode709 {
	
	public String toLowerCase(String input) {
		
		if(input == null || input.isEmpty()) {
			throw new NullPointerException("Input string is null/empty");
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			int val = ch;
			if(val >= 65 && val <= 90) {
				val += 32;
			}
			sb.append((char)val);
		}
		
		return sb.toString();
	}
}
