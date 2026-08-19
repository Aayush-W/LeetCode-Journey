class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = "";

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned += Character.toLowerCase(c);
            }
        }

        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}