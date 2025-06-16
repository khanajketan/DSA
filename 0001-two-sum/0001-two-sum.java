class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0; i<nums.length; i++){
            int p = target - nums[i];
            if(hm.containsKey(p)){
                ans[0] = hm.get(p);
                ans[1] = i;
                return ans;
            }else{
                hm.put(nums[i], i);
            }
        }
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }
}