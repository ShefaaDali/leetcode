class Solution {

    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (nums[l] <= nums[r]) {
                return nums[l];
            }

            int mid = (l + r) / 2;
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return 0;
    }
}
//solution 2
class Solution {
    public int findMin(int[] nums) {
        
     int low=0;
     int higth=nums.length-1;
     int midle=(higth+low)/2;
     int min=nums[midle];
     while (low <= higth){
         System.out.println(min);
        if(nums[low]<nums[higth]) return Math.min(min, nums[low]);//اذا هذا الشرط ما انطبق معناته في two portion
        midle =(higth+low)/2 ;
        min=Math.min(min,nums[midle]);
        if(nums[midle]>=nums[low]){
            low=midle+1;
         }else{
            higth=midle-1;
         }
     } 

     return min; 
    }
}
