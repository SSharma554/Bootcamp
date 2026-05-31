public class containerwater {
    public static int maxWater(int[] h) {
        int left = 0, right = h.length - 1;
        int best = 0;
        while (left < right) {
            int width = right - left;
            int height = Math.min(h[left], h[right]);
            best = Math.max(best, width * height);

            if (h[left] < h[right]) left++;
            else right--;
        }
        return best;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxWater(height)); // 49
    }
}