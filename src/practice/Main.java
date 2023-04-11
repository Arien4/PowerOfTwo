package practice;

// Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n == 2x.

// Example 1:
// Input: n = 1
// Output: true
// Explanation: 20 = 1
// Constraints:
// -231 <= n <= 231 - 1
// Follow up: Could you solve it without loops/recursion?

public class Main {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));
    }
    public static boolean isPowerOfTwo(int n) {
            return n > 0 && Integer.bitCount(n) == 1;
    }
}
