class Solution {
    public int firstUniqChar(String s) {

        char array[] = s.toCharArray();
        int n = array.length;
        for (int i=0;i<n;i++) {
            int count = 0;
            for (int j=0;j<n;j++) {
                if (i!=j && array[i]==array[j]) {
                    count++;
                    break;
                }
                
            }
            if (count==0) return i;
        }
        return -1;
        
    }
}