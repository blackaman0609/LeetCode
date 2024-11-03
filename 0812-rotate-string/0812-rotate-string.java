class Solution {
    public boolean rotateString(String s, String goal) {
        // Check if lengths are the same, otherwise rotation is impossible
        if (s.length() != goal.length()) {
            return false;
        }
        // Check if goal is a substring of s + s
        String doubleS = s + s;
        return doubleS.contains(goal);
    }
}
