# Median of Two Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return  **the median**  of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

 

 **Example 1:** 

```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

```

 **Example 2:** 

```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

```

 

 **Constraints:** 

- nums1.length == m
- nums2.length == n
- 0 <= m <= 1000
- 0 <= n <= 1000
- 1 <= m + n <= 2000
- -106 <= nums1[i], nums2[i] <= 106

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 23.43%)  
**Memory:** 49.2 MB (beats 15.41%)  
**Submitted:** 2026-10-05T11:02:58.115Z  

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []result = new int[nums1.length + nums2.length];
System.arraycopy(nums1,0,result,0,nums1.length);
      System.arraycopy(nums2,0,result,nums1.length,nums2.length);

        Arrays.sort(result);

        int n = result.length;
     //   int median;

        if(n%2==0){
            return (double) (result[n / 2 - 1] + result[n / 2]) / 2.0;

        }else{
return (double) result[n / 2];
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)