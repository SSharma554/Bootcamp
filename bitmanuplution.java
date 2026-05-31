public class bitmanuplution {
    // 1. get ith bit
    static int getBit(int n, int i) {
        return (n >> i) & 1;
    }

    // 2. set ith bit to 1
    static int setBit(int n, int i) {
        return n | (1 << i);
    }

    // 3. clear ith bit to 0
    static int clearBit(int n, int i) {
        return n & ~(1 << i);
    }

    // 4. toggle ith bit
    static int toggleBit(int n, int i) {
        return n ^ (1 << i);
    }

    // 5. update ith bit to 0 or 1
    static int updateBit(int n, int i, int val) {
        n = clearBit(n, i);
        return n | (val << i);
    }

    // 6. check if power of two
    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    // 7. count set bits
    static int countOnes(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt += n & 1;
            n >>= 1;
        }
        return cnt;
    }

    // 8. swap without temp
    static void swapDemo() {
        int a = 5, b = 7;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b); // 7 5
    }

    public static void main(String[] args) {
        int n = 13; // binary 1101

        System.out.println(getBit(n, 2));    // 1
        System.out.println(setBit(n, 1));     // 15 (1111)
        System.out.println(clearBit(n, 0));  // 12 (1100)
        System.out.println(toggleBit(n, 3)); // 5 (0101)
        System.out.println(isPowerOfTwo(16)); // true
        System.out.println(countOnes(n));    // 3
    }
}