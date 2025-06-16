class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int n=nums.length;
        while(j<n){
            while((j < n) && (nums[j] <= nums[i])) j++;
            if(j>= n)return i+1;
            int temp = nums[i+1];
            nums[i+1] = nums[j];
            nums[j] = temp;
            j++;
            i++;
        }
        return i+1;
    }
}