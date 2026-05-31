import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        if (str.length() == 0) {
            System.out.println("");
            sc.close();
            return;
        }
        
        int start = 0;
        int maxLength = 1;
        
       
        for (int i = 0; i < str.length(); i++) {
            
          
            int l = i;
            int r = i;
            while (l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)) {
                int currentLength = r - l + 1;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = l;
                }
                l--; // Expand left
                r++; // Expand right
            }
            
           
            l = i;
            r = i + 1;
            while (l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)) {
                int currentLength = r - l + 1;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = l;
                }
                l--; // Expand left
                r++; // Expand right
            }
        }
        
       
        String result = "";
        for (int i = start; i < start + maxLength; i++) {
            result += str.charAt(i);
        }
        
        System.out.println("Longest palindromic substring: " + result);
        sc.close();
    }
}