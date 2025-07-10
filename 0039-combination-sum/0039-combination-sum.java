class Solution {
    public void comSum(int[] arr, int sum, int target, int i, List<Integer> li, List<List<Integer>> ll){
        if(i >= arr.length){
            //if(sum == target)ll.add(new ArrayList<>(li));
            return;
        }

        if(sum + arr[i] <= target){
            
            sum += arr[i];
            li.add(arr[i]);
            System.out.println(sum);
            if(sum == target)ll.add(new ArrayList<>(li));
            comSum(arr, sum, target, i, li, ll);
            sum -= arr[i];
            li.remove(li.size() -1);

        }
           
            comSum(arr, sum, target,i+1, li, ll);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        comSum(candidates,0,target,0,li,ll);
        return ll;
    }
}