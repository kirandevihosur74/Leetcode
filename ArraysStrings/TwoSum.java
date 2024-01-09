
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

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0;i<n;i++){
            int reqNum = target - nums[i];
            if(numMap.containsKey(reqNum)){
                return new int[]{numMap.get(reqNum), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{}; //No solution Found
    }
}