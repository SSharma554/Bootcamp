
public class twopointoppositeends {
    public static void main(String[] args) {
        // 1. left-right: find pair = 9
        int[] a = {2,7,11,15};
        int l=0, r=a.length-1;
        while(l<r){
            int sum = a[l]+a[r];
            if(sum==9) break;
            if(sum<9) l++; else r--;
        }
        System.out.println("pair: " + l + "," + r); // 0,1

        // 2. slow-fast: remove duplicates
        int[] b = {0,0,1,1,2};
        int slow=0;
        for(int fast=1; fast<b.length; fast++){
            if(b[fast]!=b[slow]){
                slow++;
                b[slow]=b[fast];
            }
        }
        System.out.print("clean: ");
        for(int i=0;i<=slow;i++) System.out.print(b[i]+" "); // 0 1 2
    }
}