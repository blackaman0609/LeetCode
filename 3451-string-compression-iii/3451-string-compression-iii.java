class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int i = 0;
        
        while (i < word.length()) {
            char currentChar = word.charAt(i);
            int count = 0;

            // Count occurrences of the current character up to a maximum of 9
            while (i < word.length() && word.charAt(i) == currentChar && count < 9) {
                i++;
                count++;
            }
            
            // Append the count and the character to the compressed string
            comp.append(count).append(currentChar);
        }
        
        return comp.toString();
    }
}
