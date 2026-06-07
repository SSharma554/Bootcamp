import java.util.Arrays;

public class  Deletethesmallestelementfromanarray {
    public static int[] deleteSmallest(int[] arr) {
       
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element");
        }

   
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

     
        int[] newArr = new int[arr.length - 1];
        int newIndex = 0;


        for (int i = 0; i < arr.length; i++) {
            if (i == minIndex) {
                continue; 
            }
            newArr[newIndex] = arr[i];
            newIndex++;
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] original = {45, 12, 89, 7, 23};
        
        System.out.println("Original Array: " + Arrays.toString(original));
        
        int[] result = deleteSmallest(original);
        
        System.out.println("After deleting smallest: " + Arrays.toString(result));
    }
}