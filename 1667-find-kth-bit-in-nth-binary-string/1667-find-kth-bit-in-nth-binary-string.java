class Solution {
    public char findKthBit(int n, int k) {
        // Base case
        if (n == 1) {
            return '0';
        }

        // Length of Sn
        int len = (1 << n) - 1; // This is 2^n - 1
        int mid = len / 2 + 1; // Middle position

        // Check the position of k
        if (k == mid) {
            return '1'; // K is the middle bit
        } else if (k < mid) {
            // k is in the first half
            return findKthBit(n - 1, k);
        } else {
            // k is in the second half
            // Reflect the index for the second half
            int new_k = len - k + 1; // Reflect the position
            char bit = findKthBit(n - 1, new_k);
            return bit == '0' ? '1' : '0'; // Invert the bit
        }
    }
}
