import java.util.Scanner;

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

 class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            Solution sol = new Solution();
            while (t > 0) {
                sol.solve(sc);
                t--;
            }
        }
        sc.close();
    }
}