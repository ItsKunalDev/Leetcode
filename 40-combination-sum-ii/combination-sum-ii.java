class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combin = new ArrayList<>();
        function(candidates, ans, combin, 0, target);
        return ans;
    }

    public void function(int[] candidates, List<List<Integer>> ans, List<Integer> combin, int i, int target) {
        if (target == 0) {
            ans.add(new ArrayList<>(combin));
            return;
        }
        if (i == candidates.length || target < 0) {
            return;
        }

        for (int j = i; j < candidates.length; j++) {
            
            if (j > i && candidates[j] == candidates[j - 1]){
                continue;
            } 

            
            if (candidates[j] > target){
                break;
            } 

            combin.add(candidates[j]); 
            function(candidates, ans, combin, j + 1, target - candidates[j]); 
            combin.remove(combin.size() - 1); 
        }
    }
}
