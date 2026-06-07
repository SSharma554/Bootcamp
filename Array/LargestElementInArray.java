public class LargestElementInArray {
    public static int findLargest(int[] arr) {
        //check if the array is empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element");
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
        
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 45, 78, 23, 56, 89, 7};
        
        int largest = findLargest(numbers);
        System.out.println("The largest element is: " + largest); 
    }
}