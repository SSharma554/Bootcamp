public class tappingrainwater {
    public static int trap(int[] h) {
        int left = 0, right = h.length - 1;
        int leftMax = 0, rightMax = 0, water = 0;

        while (left < right) {
            if (h[left] < h[right]) {
                if (h[left] >= leftMax) leftMax = h[left];
                else water += leftMax - h[left];
                left++;
            } else {
                if (h[right] >= rightMax) rightMax = h[right];
                else water += rightMax - h[right];
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height)); // 6
    }
}