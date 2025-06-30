class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        function(0, nums, new ArrayList<>(), res);
        return res;

    }
    private void function(int idx, int[] nums, List<Integer> curr, List<List<Integer>> res) {
        res.add(new ArrayList<>(curr));

        for (int i = idx; i < nums.length; i++) {
            
            if (i > idx && nums[i] == nums[i - 1]) continue;

            curr.add(nums[i]);
            function(i + 1, nums, curr, res);
            curr.remove(curr.size() - 1); 
        }
    }
}