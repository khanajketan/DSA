class Solution {
    public int majorityElement(int[] nums) {
        int cad = 0;
        int cnt = 0;

        for(int num: nums){
            if(cnt == 0) cad = num;
            if(num == cad)cnt++;
            else cnt--;
        }
        return cad;
    }
}