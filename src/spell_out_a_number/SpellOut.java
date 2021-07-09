package spell_out_a_number;

public class SpellOut {
    static String spellOut(int n) {
        String[] UNITS = {
                "", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"
        };
        String[] TENS = {
                "", "", "twenty", "thirty", "forty",
                "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        if (n == 0) {
            return UNITS[n];
        } else if (n < 20) {
            return UNITS[n];
        } else if (n < 100) {
            return TENS[n / 10] + (n % 10 != 0 ? " " : "") + spellOut(n % 10);
        } else if (n < 1000) {
            return UNITS[n / 100] + " hundred" + (n % 100 != 0 ? " and " : "") + spellOut(n % 100);
        } else if (n < 1000000) {
            return spellOut(n / 1000) + " thousand" + (n % 1000 != 0 ? ", " : "") + spellOut(n % 1000);
        } else if (n < 1000000000) {
            return spellOut(n / 1000000) + " million" + (n % 1000000 != 0 ? ", " : "") + spellOut(n % 1000000);
        } else {
            return "The number is too large";
        }
    }
}
