# Container With Most Water

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `ith` line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return  *the maximum amount of water a container can store*.

 **Notice**  that you may not slant the container.

 

 **Example 1:** 

```
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

```

 **Example 2:** 

```
Input: height = [1,1]
Output: 1

```

 

 **Constraints:** 

- n == height.length
- 2 <= n <= 105
- 0 <= height[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.5 MB  
**Submitted:** 2026-09-30T01:55:11.208Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/container-with-most-water/)