import java.util.*;

public class Repeatcharactersaccordingtofrequency {

    static int i = 0;

    static String decode(String s) {
        String res = "";

        while (i < s.length() && s.charAt(i) != ']') {

            if (Character.isLetter(s.charAt(i))) {
                res += s.charAt(i++);
            } else {

                int num = 0;

                while (Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                i++; // skip [

                String temp = decode(s);

                i++; // skip ]

                for (int k = 0; k < num; k++) {
                    res += temp;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(decode(s));
    }
}