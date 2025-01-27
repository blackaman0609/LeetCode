
class Solution {
    public int singleNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i] && i!=j) {
                count++;
                break;
                }
            }
            if (count == 0) {
                return arr[i];
            }
        }
        return -1;
    }
}

















