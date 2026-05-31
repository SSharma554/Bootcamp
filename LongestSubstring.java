import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int maxLength = 0;
        
       
        for (int i = 0; i < str.length(); i++) {
            String currentSubstring = "";
            
           
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                boolean duplicate = false;
                
              
                for (int k = 0; k < currentSubstring.length(); k++) {
                    if (currentSubstring.charAt(k) == ch) {
                        duplicate = true;
                        break;
                    }
                }
                
               
                if (duplicate) {
                    break;
                } else {
                    currentSubstring += ch;
                    if (currentSubstring.length() > maxLength) {
                        maxLength = currentSubstring.length();
                    }
                }
            }
        }
        
        System.out.println("Length of longest substring without repeating characters: " + maxLength);
        sc.close();
    }
}