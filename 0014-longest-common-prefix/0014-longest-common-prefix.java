class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;

        Arrays.sort(strs);
        
        String s1 = strs[0];
        String s2 = strs[n-1];

        int count = 0;
        while (count<s1.length()) {
            if (s1.charAt(count)==s2.charAt(count)) {
                count++;
            }
            else break;
        }
        return count==0 ? "" : s1.substring(0,count);
    }
}