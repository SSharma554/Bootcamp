import java.util.Scanner;

public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume leftover newline
        
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }
        
       
        boolean[] visited = new boolean[n];
        
        System.out.println("Grouped Anagrams:");
        
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            
           
            String currentGroup = "[" + arr[i];
            visited[i] = true;
            
            
            for (int j = i + 1; j < n; j++) {
                if (visited[j]) {
                    continue;
                }
                
               
                if (arr[i].length() == arr[j].length()) {
                    int[] counts = new int[256];
                    for (int k = 0; k < arr[i].length(); k++) {
                        counts[arr[i].charAt(k)]++;
                        counts[arr[j].charAt(k)]--;
                    }
                    
                    boolean isAnagram = true;
                    for (int k = 0; k < 256; k++) {
                        if (counts[k] != 0) {
                            isAnagram = false;
                            break;
                        }
                    }
                    
                  
                    if (isAnagram) {
                        currentGroup += ", " + arr[j];
                        visited[j] = true;
                    }
                }
            }
            currentGroup += "]";
            System.out.println(currentGroup);
        }
        
        sc.close();
    }
}