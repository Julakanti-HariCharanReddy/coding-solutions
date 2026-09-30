class Solution {
    public int maxArea(int[] height) {
       int n = height.length-1;
       int l = 0;
       int r = n;
       int maxw = 0;
       while(l<r){
        int w = r - l ;
        int curh = Math.min(height[l],height[r]);
        int curA = curh * w;
        maxw = Math.max(maxw,curA);

        if(height[l]<height[r]){
l++;
       }else{
        r--;
       }
       }
       return maxw;
    }
}