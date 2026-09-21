class Solution {
    public void solve(Scanner sc) {
        String s = sc.next();
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
        System.out.println(pairs);
    }
}
