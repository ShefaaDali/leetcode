class Solution {
        //O(n)
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
        
           //Solution 2 | O(n logn)
         /* Arrays.sort(nums);   
        for(int i=0;i<nums.length-1;i++)
        if (nums[i]==nums[i+1])
        return true;
        return false;*/
    }
}
