
public class countvowel {
    public static void main(String[] args) {
        
        char arr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',};
        int count = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                count++;
            }
        }
        System.out.println("Total vowels = " + count);
    }
}