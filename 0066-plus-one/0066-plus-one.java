public class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the end of the array
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment it and return the result
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, set it to 0
            digits[i] = 0;
        }
        

        
        // If all digits were 9, we need to add a new digit at the beginning
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1; // The first digit is 1
        // The rest of the digits remain 0 by default
        
        return newNumber;
    }
}