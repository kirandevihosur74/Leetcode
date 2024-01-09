
// Brute Force Approach

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Outer Loop of Left pointer
        for(int i=0;i<nums.length;i++){
            //Inner Loop of Right pointer
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        // If no solution is found return empty array 
        return new int[]{};
    }
}

// Using HashMap Appraoch 