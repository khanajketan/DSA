class Solution {
    public int majorityElement(int[] nums) {
        int cad = 0;
        int cnt = 0;

        for(int num=0; num<nums.length;num++){
            if(cnt == 0) cad = nums[num];
            if(nums[num] == cad)cnt++;
            else cnt--;
        }
        return cad;
    }
}