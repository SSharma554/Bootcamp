public class kmp {
    static int[] buildLPS(String pat) {
        int[] lps = new int[pat.length()];
        int len = 0, i = 1;
        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len!= 0) len = lps[len - 1];
                else { lps[i] = 0; i++; }
            }
        }
        return lps;
    }

    static int search(String txt, String pat) {
        int[] lps = buildLPS(pat);
        int i = 0, j = 0;
        while (i < txt.length()) {
            if (txt.charAt(i) == pat.charAt(j)) { i++; j++; }
            if (j == pat.length()) return i - j; // found
            else if (i < txt.length() && txt.charAt(i)!= pat.charAt(j)) {
                if (j!= 0) j = lps[j - 1];
                else i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search("abxabcabcaby", "abcaby")); // 6
    }
}