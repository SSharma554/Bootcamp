public class slidingwindow {
    public static void main(String[] args) {
        // 1. fixed: max sum of 3
        int[] a = {2,1,5,1,3,2};
        int k = 3, left = 0, sum = 0, best = 0;
        for (int right = 0; right < a.length; right++) {
            sum += a[right];
            if (right - left + 1 > k) {
                sum -= a[left];
                left++;
            }
            if (right - left + 1 == k) best = Math.max(best, sum);
        }
        System.out.println("max sum k=3: " + best); // 9

        // 2. variable: longest without repeat
        String s = "abcabcbb";
        left = 0; best = 0;
        java.util.Set<Character> set = new java.util.HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            best = Math.max(best, right - left + 1);
        }
        System.out.println("longest unique: " + best); // 3
    }
}