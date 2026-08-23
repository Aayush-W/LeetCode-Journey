class Solution {
    public boolean sumGame(String num) {

        int n = num.length();

        int leftSum = 0;
        int rightSum = 0;

        int leftQ = 0;
        int rightQ = 0;

        // Left half
        for (int i = 0; i < n / 2; i++) {
            char c = num.charAt(i);

            if (c == '?') {
                leftQ++;
            } else {
                leftSum += c - '0';
            }
        }

        // Right half
        for (int i = n / 2; i < n; i++) {
            char c = num.charAt(i);

            if (c == '?') {
                rightQ++;
            } else {
                rightSum += c - '0';
            }
        }

        int totalQ = leftQ + rightQ;

        // Odd number of '?' -> Alice wins
        if (totalQ % 2 == 1) {
            return true;
        }

        // Bob wins only if this exact balance is possible
        return leftSum - rightSum
                != 9 * (rightQ - leftQ) / 2;
    }
}