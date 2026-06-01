import java.util.*;

public class Insertastringatagivenposition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int pos = sc.nextInt();
        char ch = sc.next().charAt(0);

        String result =
                str.substring(0, pos) +
                ch +
                str.substring(pos);

        System.out.println(result);
    }
}