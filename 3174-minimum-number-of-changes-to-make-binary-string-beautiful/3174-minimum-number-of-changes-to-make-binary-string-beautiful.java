class Solution {
    public int minChanges(String s) {
        int changes = 0;
        int n = s.length();
        
        // Iterate through the string in steps of 2
        for (int i = 0; i < n; i += 2) {
            // Check the current pair of characters
            if (s.charAt(i) != s.charAt(i + 1)) {
                // If they are different, we need one change
                changes++;
            }
        }
        
        return changes;
    }
}
