import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str=sc.nextLine();

        boolean found=false;

        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            int count=0;

            for(int j=0;j<str.length();j++){
                if(current==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println("First non-repeating character is: "+current);
            found=true;
            break;
            }
        }
        if(!found){
            System.out.println("No non-repeating character found.");
        }
        
        sc.close();
        }
    }

