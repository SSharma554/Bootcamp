public class rabinkarp {
    static int search(String txt, String pat) {
        int d = 256, q = 101; // base and prime
        int m = pat.length(), n = txt.length();
        int h = 1, p = 0, t = 0;

        for (int i = 0; i < m - 1; i++) h = (h * d) % q;

        for (int i = 0; i < m; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        for (int i = 0; i <= n - m; i++) {
            if (p == t) {
                if (txt.substring(i, i + m).equals(pat)) return i;
            }
            if (i < n - m) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
                if (t < 0) t += q;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search("abxabcabcaby", "abcaby")); // 6
    }
}