/*Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
*/

//Solution

class JavaArrayProblem9 {
        	 public static int threeSumClosest(int[] nums, int target) {
		 Arrays.sort(nums);
		 int l=nums.length;
		 int sum=nums[0]+nums[1]+nums[l-1];
		 for(int i=0;i<l-2;i++) 
		 {
			int a=i+1;
			int temp=0;
                              int n=nums.length-1;
			while(a<n) 
			{
				temp=nums[i]+nums[a]+nums[n];
				if(temp>target) n--;
				else a++;
				if(Math.abs(sum-target)>Math.abs(temp-target)) 
				{
					sum=temp;
				}
			}
		 } 
	        return sum;
             }
    }