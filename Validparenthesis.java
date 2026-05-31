import java.util.Scanner;

public class Validparenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter parenthesis string: ");
        String str = sc.nextLine();
        
        
        char[] stack = new char[str.length()];
        int top = -1;
        boolean isValid = true;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
          
            if (ch == '(' || ch == '{' || ch == '[') {
                top++;
                stack[top] = ch;
            } 
           
            else if (ch == ')' || ch == '}' || ch == ']') {
               
                if (top == -1) {
                    isValid = false;
                    break;
                }
                
                char openBracket = stack[top];
                top--; // Pop the element
                
             
                if ((ch == ')' && openBracket != '(') || 
                    (ch == '}' && openBracket != '{') || 
                    (ch == ']' && openBracket != '[')) {
                    isValid = false;
                    break;
                }
            }
        }
        
       
        if (top != -1) {
            isValid = false;
        }
        
        if (isValid) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        sc.close();
    }
}