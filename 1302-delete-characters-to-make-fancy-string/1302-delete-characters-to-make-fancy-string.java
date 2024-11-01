class Solution {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // Check if the last two characters in the result are the same as the current one
            int len = result.length();
            if (len >= 2 && result.charAt(len - 1) == currentChar && result.charAt(len - 2) == currentChar) {
                continue; // Skip this character to avoid three consecutive identical characters
            }
            
            result.append(currentChar); // Add the current character to the result
        }
        
        return result.toString();
    }
}
