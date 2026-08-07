class Solution {

    private final String[] belowTwenty = {
        "", "One", "Two", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
        "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    };

    private final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public String numberToWords(int num) {

        if (num == 0)
            return "Zero";

        StringBuilder result = new StringBuilder();

        if (num >= 1000000000) {
            result.append(convert(num / 1000000000))
                  .append("Billion ");
            num %= 1000000000;
        }

        if (num >= 1000000) {
            result.append(convert(num / 1000000))
                  .append("Million ");
            num %= 1000000;
        }

        if (num >= 1000) {
            result.append(convert(num / 1000))
                  .append("Thousand ");
            num %= 1000;
        }

        if (num > 0)
            result.append(convert(num));

        return result.toString().trim();
    }

    private String convert(int num) {

        if (num == 0)
            return "";

        if (num < 20)
            return belowTwenty[num] + " ";

        if (num < 100)
            return tens[num / 10] + " " + convert(num % 10);

        return belowTwenty[num / 100] + " Hundred " + convert(num % 100);
    }
}