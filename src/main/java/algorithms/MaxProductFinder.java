package algorithms;

import java.util.logging.Logger;

public class MaxProductFinder {
	
	Logger LOG = Logger.getLogger("MaxProductFinder");
	
	// [1, 5, 7, 3, 2]
	
	public int findMaxProduct(int[] arr) {
		int maxProduct = 0;
		int numComputations = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				LOG.info("i=" + i + ", j=" + j);
				
				numComputations++;
											
				int product = arr[i] * arr[j];
				if(product > maxProduct) {
					maxProduct = product;
				}
			}
		}
		
		LOG.info("Number of computations = " + numComputations);
		
		return maxProduct;
	}
}
