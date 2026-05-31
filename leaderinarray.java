
public class leaderinarray{
    public static void main(String[] args){
        int arr[] = {16,17,4,3,5,2};
        int n = arr.length;

        System.out.println("Leaders in the array: ");
        for(int i=0;i<n;i++){
            boolean isLeader = true;
            for(int j=i+1;j<n;j++){
                if(arr[j] > arr[i]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader==true){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
