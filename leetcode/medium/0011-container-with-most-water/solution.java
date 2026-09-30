class Solution {
    public int maxArea(int[] height) {
         int l = 0;
        int r = height.length-1;
         int lm = height[l];
        int rm = height[r];
        int temp = 0;
int c = 0 ; 
        while(l<r){
           if(lm <= rm){
            l++;
            lm = Math.max(lm,height[l]);
           // temp += lm - height[l];
           }
           else{
            r--;
            rm = Math.max(rm, height[r]);
            //temp += rm - height[r];
             }
             int w = r-l;
             temp = Math.min(lm,rm)*w;
             if(temp > c){
                c = temp;
             }
        }
           
        return c ;
    }
}