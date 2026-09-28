# Subarray Sum Equals K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` and an integer `k`, return  *the total number of subarrays whose sum equals to*  `k`.

A subarray is a contiguous  **non-empty**  sequence of elements within an array.

 

 **Example 1:** 

```
Input: nums = [1,1,1], k = 2
Output: 2

```

 **Example 2:** 

```
Input: nums = [1,2,3], k = 3
Output: 2

```

 

 **Constraints:** 

- 1 <= nums.length <= 2 * 104
- -1000 <= nums[i] <= 1000
- -107 <= k <= 107

## Solution

**Language:** Java  
**Runtime:** 1564 ms (beats 5.29%)  
**Memory:** 48.7 MB (beats 59.99%)  
**Submitted:** 2026-09-28T18:33:42.727Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/subarray-sum-equals-k/)