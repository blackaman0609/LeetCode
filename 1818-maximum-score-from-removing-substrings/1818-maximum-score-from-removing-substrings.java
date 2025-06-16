class Solution {
    public int maximumGain(String s, int x, int y) {
        String first, second;
        int top_score, bot_score;

        // Decide which substring to prioritize
        if (y > x) {
            first = "ba";
            top_score = y;
            second = "ab";
            bot_score = x;
        } else {
            first = "ab";
            top_score = x;
            second = "ba";
            bot_score = y;
        }

        StringBuilder temp1 = new StringBuilder();  // Use StringBuilder for efficient manipulation
        int res = 0;

        // First pass: remove higher scoring substring greedily
        for (int i = 0; i < s.length(); i++) {
            if (temp1.length() != 0 &&
                s.charAt(i) == first.charAt(1) &&
                temp1.charAt(temp1.length() - 1) == first.charAt(0)) {

                temp1.setLength(temp1.length() - 1); // remove the matching char
                res += top_score;

            } else {
                temp1.append(s.charAt(i)); // push current character
            }
        }

        // Now process remaining for the lower priority substring
        StringBuilder temp2 = new StringBuilder();
        for (int i = 0; i < temp1.length(); i++) {
            if (temp2.length() != 0 &&
                temp1.charAt(i) == second.charAt(1) &&
                temp2.charAt(temp2.length() - 1) == second.charAt(0)) {

                temp2.setLength(temp2.length() - 1);
                res += bot_score;

            } else {
                temp2.append(temp1.charAt(i));
            }
        }

        return res;
    }
}
