package algorithms;

import java.util.Arrays;
import java.util.logging.Logger;

public class ArraySmallestThreeFinder {
	
	private final Logger LOG = Logger.getLogger("ArraySmallestThreeFinder");
	
	// [5, 1, 3, 9, 4, 19]
	public int[] findSmallestThree(int[] arr) {
		LOG.info("Input array: " + Arrays.toString(arr));
		
		// Initialize an array of size 3 with Integer.MAX_VALUE to start with...
		//
		int[] smarr = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] < smarr[0]) {
				smarr[2] = smarr[1];
				smarr[1] = smarr[0];
				smarr[0] = arr[i];
				
			} else if (arr[i] < smarr[1]) {
				smarr[2] = smarr[1];
				smarr[1] = arr[i];
				
			} else if(arr[i] < smarr[2]) {
				smarr[2] = arr[i];
			}
		}
		
		LOG.info("small array: " + Arrays.toString(smarr));
	
		return smarr;
	}
	
	public static void main(String[] args) {
		ArraySmallestThreeFinder finder = new ArraySmallestThreeFinder();
		int[] arr = {5, 1, 2, 7, 11, 3, 9, 4, 19};
		finder.findSmallestThree(arr);
	}
}