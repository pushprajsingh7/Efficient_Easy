
public class ArrayLogic {
	    public int[] twoSum(int[] nums, int target) {
	        int y = 0;
	        int x = 0;
	        for(int i=0;i<nums.length-1;i++) {
				 x =nums[i];
			for(int j=i+1; j<=nums.length-1;j++) {
				 y=nums[j];
	        
				if(x+y==target) {
					int[]arr= {i,j};
					return arr;
	            }
				else {
					return nums ;
	        }
				
			}
		
				
	    }
			return nums;
	    
}}



	   
	

