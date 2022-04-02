/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4*/

//Solution

class JavaArrayProblem4 {
public int searchInsert(int[] nums, int target)
  {
      int n=nums.length;
      if(target>nums[n-1])return n;
      if(n==0)return 0;
      for(int i=0;i<n;i++)
      {
          if(nums[i]==target || nums[i]>target)
          {return i;}
      }
      return 0; 
  }
}