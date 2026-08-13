class Solution {

    public String longestCommonPrefix(String[] strs) {

        String first = strs[0];

        for (int len = first.length(); len >= 0; len--) {

            String prefix = first.substring(0, len);

            boolean valid = true;

            for (int i = 1; i < strs.length; i++) {

                if (!strs[i].startsWith(prefix)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                return prefix;
            }
        }

        return "";
    }
}