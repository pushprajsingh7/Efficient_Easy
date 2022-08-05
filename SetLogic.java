import java.util.HashSet;
import java.util.Set;

class Solution {
	public boolean set(int[]arr) {
		
		return false;
		
	}
	    public boolean containsDuplicate(int[] nums) {
	     Set<Integer> set = new HashSet<Integer>();
	  for (int i : nums) {
	    if (set.contains(i)) {
	        return true;
	        }
	    set.add(i);
	  }
	        
	        return false;
	  }

	}

