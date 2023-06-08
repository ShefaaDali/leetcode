class Solution {

    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int n : nums) {
            sum += n;
            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}

//solustion 2
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int left=0;
        int right=1;
        int sum=nums[0];
        int max=nums[left];
        while(right!=nums.length){
            sum+=nums[right];       
            if(nums[right]>sum){
                left = right;
                sum=nums[left]; 
            }
            if(sum>max) max=sum;    
             right++;
            }
                return max;
    }
}
