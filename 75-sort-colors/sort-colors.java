class Solution {
    public void sortColors(int[] nums) {
       int n = nums.length;
       int count1 = 0;
       int count2 = 0;
       int count3 = 0;
       for(int i=0;i<n;i++){
           if(nums[i]==0){
        count1++;
       }
       else if(nums[i]==1){
        count2++;
       }
       else if(nums[i]==2){
        count3++;
       }
       }

       for(int i=0;i<count1;i++){
        nums[i] = 0;
       }
       for(int i=count1;i<count1+count2;i++){
        nums[i] = 1;
       }
       for(int i=count1+count2;i<nums.length;i++){
        nums[i] = 2;
       }
    }
}