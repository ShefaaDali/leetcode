class Solution {
//O(n)
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
        //solution 2 |time complexity O(n^2)
        /*
        int[] ans=new int [2];
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++)
            if(nums[i]+nums[j]==target){
               ans[0] =i;
                ans[1]=j;
                break;
            }
        }
        return ans;*/
    }
}
