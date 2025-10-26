class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for(int i = 0;i<nums.length; i++){
            for(int j = i+1;j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;       
    }   
}

/*
HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement is already in map, return indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, add current number with its index
            map.put(nums[i], i);
        }

        return new int[] {};
*/
