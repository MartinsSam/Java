package leetcode;
/*
 * https://leetcode.com/problems/search-insert-position/
*/
public class SearchInsertPosition_2 {
    public int searchInsert(int[] nums, int target) {
        int pos = 0; 
        boolean found = false;
        if (target > nums[nums.length-1]) {
        	return nums.length;
        }else {
        	while (!found && pos < nums.length) {
        		if ((nums[pos] == target) || (nums[pos] > target)) {
        			return pos;
        		}
        		pos++;
        	}
        }
		return pos;
    }
}
