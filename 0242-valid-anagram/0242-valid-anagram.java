class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();

        char array1[] = s.toCharArray();
        Arrays.sort(array1);
        // s = new String(array1);

        char array2[] = t.toCharArray();
        Arrays.sort(array2);
        // t = new String(array2);

        return Arrays.equals(array1, array2);

        // return s.equals(t);

    }
}