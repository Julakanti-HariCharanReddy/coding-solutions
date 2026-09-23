# Trapping Rain Water

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

 

 **Example 1:** 

```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

```

 **Example 2:** 

```
Input: height = [4,2,0,3,2,5]
Output: 9

```

 

 **Constraints:** 

- n == height.length
- 1 <= n <= 2 * 104
- 0 <= height[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-09-23T10:21:24.312Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/trapping-rain-water/)