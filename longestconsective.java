import java.util.HashSet;
import java.util.Set;

public class longestconsective {
    public int longestconsectivee (int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int x : nums) s.add(x);
        
        int ans = 0;
        for (int x : s) {
            if (!s.contains(x - 1)) { // start of sequence
                int cur = x;
                int len = 1;
                while (s.contains(cur + 1)) {
                    cur++;
                    len++;
                }
                ans = Math.max(ans, len);
            }
        }
        return ans;
    }

    // test
    public static void main(String[] args) {
        longestconsective sol = new longestconsective();
        System.out.println(sol.longestconsectivee(new int[]{100,4,200,1,3,2})); // 4
        System.out.println(sol.longestconsectivee(new int[]{50,51,52,1,3})); // 3
    }
}