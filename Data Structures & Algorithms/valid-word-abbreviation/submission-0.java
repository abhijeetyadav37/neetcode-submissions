class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {

        // Pointer for the original word
        int wordIndex = 0;

        // Pointer for the abbreviation
        int abbrIndex = 0;

        // Continue until one of the strings finishes
        while (wordIndex < word.length() && abbrIndex < abbr.length()) {

            char current = abbr.charAt(abbrIndex);

            // CASE 1 : Current character is a letter
            if (Character.isLetter(current)) {

                // Letter must exactly match the word
                if (word.charAt(wordIndex) != current) {
                    return false;
                }

                // Move both pointers forward
                wordIndex++;
                abbrIndex++;
            }

            // CASE 2 : Current character is a digit
            else {

                // Numbers like 01, 05, 012 are invalid
                if (current == '0') {
                    return false;
                }

                int skip = 0;

                // Read the complete number
                // Example: "123" becomes integer 123
                while (abbrIndex < abbr.length()
                        && Character.isDigit(abbr.charAt(abbrIndex))) {

                    // Build the number digit by digit
                    // Example:
                    // skip = 1
                    // skip = 12
                    // skip = 123
                    skip = skip * 10 + (abbr.charAt(abbrIndex) - '0');

                    abbrIndex++;
                }

                // Skip these many characters in the original word
                wordIndex += skip;
            }
        }

        // Valid only if BOTH strings finish together
        return wordIndex == word.length()
                && abbrIndex == abbr.length();
    }
}