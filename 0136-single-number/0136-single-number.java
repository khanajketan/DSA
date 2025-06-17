class Solution {
    public int singleNumber(int[] nums) {
        int ele = nums[0];
        for(int i =1; i<nums.length; i++){
            ele = ele ^ nums[i];
        }

        return ele;
    }
}