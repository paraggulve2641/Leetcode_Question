class Solution {
    public int[] rearrangeArray(int[] nums) {
       int[] positive = new int[nums.length/2];
       int[] negative = new int[nums.length/2];
       int[] ans =new int [nums.length];
       int p = 0;
       int n = 0;
       int k = 0;
       int i = 0;

       for(i = 0 ; i<nums.length ; i++){
        if(nums[i] > 0){
            positive[p] = nums[i];
            p++;
        }
        else{
            negative[n] = nums[i];
            n++;
        }
       } 
       n = 0;
       p = 0;
       k = 0;
       i = 0;

       while(p < positive.length && n<negative.length){
         ans[k] = positive[p];
         k++;
         p++;

         ans[k] = negative[n];
         k++;
         n++;
       }
       return ans;
    }
}