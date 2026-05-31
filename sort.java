import java.util.Arrays;

public class sort {
    public static void sort012(int[] arr) {
        int zero = 0, one = 0, two = 0;

        // 1. count
        for (int n : arr) {
            if (n == 0) zero++;
            else if (n == 1) one++;
            else two++;
        }

        // 2. fill back
        int i = 0;
        while (zero-- > 0) arr[i++] = 0;
        while (one-- > 0) arr[i++] = 1;
        while (two-- > 0) arr[i++] = 2;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 0, 1, 2, 1, 0};
        sort012(a);
        System.out.println(Arrays.toString(a)); // [0, 0, 0, 1, 1, 1, 2, 2]
    }
}