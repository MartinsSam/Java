package leetcode;
/*
 * https://leetcode.com/problems/search-insert-position/
*/
public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int pos = 0; 
		if (target > nums[nums.length-1]) {
			return nums.length;
		}else {
			while (pos < nums.length) {
				if ((nums[pos] > target) || (nums[pos] == target)) {
					break;
				}
				pos++;
			}
		}
		return pos;
	}
}
