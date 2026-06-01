import java.util.*;

public class nonrepeatingcharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char ans = '#';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                ans = ch;
                break;
            }
        }

        if (ans == '#')
            System.out.println("-1");
        else
            System.out.println(ans);
    }
}