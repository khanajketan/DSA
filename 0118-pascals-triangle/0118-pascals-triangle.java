class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> LL = new ArrayList<List<Integer>>();

        for(int i=1; i<=numRows; i++){
            List<Integer> list = new ArrayList<>();
            int ans = 1;
            list.add(ans);

            for(int j=1; j<i; j++){
                ans = ans * (i - j);
                ans = ans / j;
                list.add(ans);
            }

            LL.add(list);
        }

        return LL;

    }
}