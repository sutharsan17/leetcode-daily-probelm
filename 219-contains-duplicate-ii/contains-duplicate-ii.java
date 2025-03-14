
import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true; // Found duplicate within k distance
            }

            set.add(nums[i]); // Add current element
            
            if (set.size() > k) { 
                set.remove(nums[i - k]); // Maintain sliding window size
            }
        }
        
        return false;
    }
}
