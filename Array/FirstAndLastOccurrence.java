public class FirstAndLastOccurrence {
    public static void findFirstAndLast(int[] arr, int x) {
        int first = -1;
        int last = -1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        System.out.println("First Occurrence Index: " + first);
        System.out.println("Last Occurrence Index: " + last);
        
        if (first != -1) {
            System.out.println("Difference between indices: " + (last - first));
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 5, 5, 5, 7, 9};
        int target = 5;
        
        findFirstAndLast(arr, target);
    }
}