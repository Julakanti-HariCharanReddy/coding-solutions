class Solution {
    public int trap(int[] height) {
        int n = height.length-1;
        int lm = height[0];
        int rm = height[n];
        int l = 0;
        int r = height.length-1;
        int temp = 0;

        while(l<=r){
            if (lm > height[l]){
                temp  = lm - height[l] + temp;
                //lm= Math.max(lm,height[l]);
                l++;
            }else{
                 lm= Math.max(lm,height[l]);
                r--;
            }
            if(rm > height[r]){
                temp = rm - height[r] + temp;
                //rm= Math.max(rm,height[r]);
                r--;
            }else{
                l++;
                  rm= Math.max(rm,height[r]);
            }
        }
        return temp;

    }
}