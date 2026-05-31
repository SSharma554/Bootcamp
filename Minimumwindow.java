import java.util.Scanner;

public class Minimumwindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter main string s: ");
        String str = sc.nextLine();
        
        System.out.print("Enter target string t: ");
        String target = sc.nextLine();
        
        if (str.length() < target.length() || target.length() == 0) {
            System.out.println("");
            sc.close();
            return;
        }
        
       
        int[] targetCounts = new int[256];
        for (int i = 0; i < target.length(); i++) {
            targetCounts[target.charAt(i)]++;
        }
        
        int[] windowCounts = new int[256];
        int left = 0;
        int right = 0;
        int totalNeeded = target.length();
        int currentMatches = 0;
        
        int bestStart = 0;
        int minLength = str.length() + 1;
        boolean matchFound = false;
        
        // Use a sliding window loop
        while (right < str.length()) {
            char ch = str.charAt(right);
            windowCounts[ch]++;
            
            
            if (targetCounts[ch] > 0 && windowCounts[ch] <= targetCounts[ch]) {
                currentMatches++;
            }
            
           
            while (currentMatches == totalNeeded) {
                matchFound = true;
                int currentWindowSize = right - left + 1;
                
                if (currentWindowSize < minLength) {
                    minLength = currentWindowSize;
                    bestStart = left;
                }
                
                char leftChar = str.charAt(left);
                windowCounts[leftChar]--;
                
              
                if (targetCounts[leftChar] > 0 && windowCounts[leftChar] < targetCounts[leftChar]) {
                    currentMatches--;
                }
                left++;
            }
            right++;
        }
        
       
        String result = "";
        if (matchFound) {
            for (int i = bestStart; i < bestStart + minLength; i++) {
                result += str.charAt(i);
            }
        }
        
        System.out.println(result);
        sc.close();
    }
}