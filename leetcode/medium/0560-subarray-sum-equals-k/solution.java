class Solution {
    public int subarraySum(int[] nums, int k) {
        int kp = 0 ; 

        int n = nums.length;
        for(int i = 0 ; i<n;i++){
           int  sum= 0;
            for(int l = i;l<n;l++){
            sum += nums[l];
            if(sum == k){
                kp++;
            }
            }
        }
        return kp;
}
}