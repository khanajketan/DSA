class Solution {

    public void comSumII(int[] arr, int sum, int target, List<Integer> li, List<List<Integer>> ll, int i){
        if(i >= arr.length){
           
            return;
        }
        if(sum > target)return;

        
        sum += arr[i];
        li.add(arr[i]);
        if(sum == target){
            ll.add(new ArrayList<>(li));
         }
        comSumII(arr, sum, target, li, ll, i+1);
        sum -= arr[i];
        li.remove(li.size()-1);

        int next = i+1;
        while(next < arr.length && arr[next] == arr[i])next++;
        comSumII(arr, sum, target, li, ll, next);

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>> ll = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        Arrays.sort(candidates);
        comSumII(candidates,0,target,li, ll, 0);
        return ll;
    }
}