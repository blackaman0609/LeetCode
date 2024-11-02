class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        
        // Check if the last character of each word matches the first character of the next word
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            String nextWord = words[(i + 1) % words.length]; // wrap-around to make circular check
            
            // If last char of current word is not equal to first char of next word, return false
            if (currentWord.charAt(currentWord.length() - 1) != nextWord.charAt(0)) {
                return false;
            }
        }
        
        return true; // All checks passed, it's circular
    }
}
