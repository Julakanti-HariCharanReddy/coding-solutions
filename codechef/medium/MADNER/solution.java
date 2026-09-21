class Solution {
    public int findMaximumPairs(String s) {
        int pairs = 0;
        int i = 0;
        int n = s.length();
        
        while (i < n - 1) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                pairs++;
                i += 2;
            } else {
                i++;
            }
        }
        return pairs;
    }
}
