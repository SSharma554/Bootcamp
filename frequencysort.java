import java.util.*;

public class frequencysort {
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {
            int fa = count.get(a);
            int fb = count.get(b);
            if (fa!= fb) return fa - fb;
            return b - a;
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3};
        int[] ans = frequencySort(nums);

        System.out.println(Arrays.toString(ans)); 
    }
}