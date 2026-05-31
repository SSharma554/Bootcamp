import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        if (str.isEmpty()) {
            System.out.println("");
            sc.close();
            return;
        }
        
        String compressed = "";
        int count = 1;
        
        for (int i = 0; i < str.length(); i++) {
           
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                
                compressed += str.charAt(i);
                compressed += count;
                count = 1; 
            }
        }
        
       
        if (compressed.length() < str.length()) {
            System.out.println("Compressed string: " + compressed);
        } else {
            System.out.println("Can't be Compressed: " + str);
        }
        
        sc.close();
    }
}