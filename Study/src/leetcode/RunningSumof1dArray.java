package leetcode;
/*
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */
public class RunningSumof1dArray {
    public int[] runningSum(int[] nums) {
    	int [] calcResult = new int[nums.length];  	
    	int pos = 0;
    	calcResult[pos] = nums[pos]; 
    	while(pos < nums.length-1) {
    		pos +=1;
    		calcResult[pos] =calcResult[pos-1] + nums[pos];
      	}
        return calcResult;
        
    }
    
 }
