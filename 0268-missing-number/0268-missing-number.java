class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int s1 = n * (n + 1) / 2;
        int s2 = 0;
        for (int a : arr) {
            s2 = s2 + a;
        }
        return s1-s2;
    }
}


































