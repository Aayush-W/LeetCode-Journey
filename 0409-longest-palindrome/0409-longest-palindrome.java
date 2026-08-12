class Solution {

    public int longestPalindrome(String s) {

        int[] frequency = new int[128];

        // Count characters
        for (char c : s.toCharArray()) {
            frequency[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        // Process frequencies
        for (int count : frequency) {

            // Take the largest even part
            length += (count / 2) * 2;

            // Check for odd frequency
            if (count % 2 == 1) {
                hasOdd = true;
            }
        }

        // One odd character can go in the center
        if (hasOdd) {
            length++;
        }

        return length;
    }
}