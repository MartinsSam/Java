package leetcode;
/*
 * https://leetcode.com/problems/search-insert-position/
*/
public class SearchInsertPosition_BinarySearchAlg {

	public int searchInsert(int[] nums, int target) {
		int array_left_side = 0;
		int array_right_side = nums.length -1;

		return binarySearch(nums,array_left_side,array_right_side,target);

	}
	
	public int binarySearch(int[] nums,int  array_left_side, int array_right_side, int target) {

		if (array_right_side >= array_left_side) {
			int array_middle = array_left_side + (array_right_side - array_left_side) / 2;

			//System.out.println( array_left_side + " + " +  "(" + array_right_side +"-"+ array_left_side + ")" + "/ 2 = " + array_left_side);

			if(nums[array_middle] == target) {
				return array_middle;
			}else if(nums[array_middle] > target) {

				array_right_side = array_middle - 1;
				return binarySearch(nums,array_left_side,array_right_side,target);
			}else {
				array_left_side = array_middle + 1;
				return binarySearch(nums,array_left_side,array_right_side,target);
			}
		}else {
			if(array_left_side > nums.length) {
				return array_left_side -1;
			}else {
				return array_right_side +1;
			}
		}
	}
}
