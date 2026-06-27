class Solution {
  public String convert(String s, int numRows) {
         // Edge Case:
        // If there is only one row, there is no zigzag.
        // Also, if the string length is less than or equal to numRows,
        if (numRows == 1 || s.length() <= numRows)
            return s;

        // Each StringBuilder represents one row of the zigzag.
        StringBuilder[] rows = new StringBuilder[numRows];

        // Initialize every row with an empty StringBuilder.
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // Start from the first row.
        int currentRow = 0;

        // Indicates whether we are moving downward or upward.
        // true  -> moving down
        // false -> moving up
        boolean goingDown = true;

        // Traverse every character of the input string.
        for (char ch : s.toCharArray()) {

            // Put the current character into the current row.
            rows[currentRow].append(ch);

            // If we reach the first row,
            // start moving downward.
            if (currentRow == 0) {
                goingDown = true;
            }

            // If we reach the last row,
            // start moving upward.
            else if (currentRow == numRows - 1) {
                goingDown = false;
            }

            // Move to the next row based on the current direction.
            if (goingDown)
                currentRow++;      // Move Down
            else
                currentRow--;      // Move Up
        }

        // This StringBuilder will store the final answer.
        StringBuilder ans = new StringBuilder();

        // Concatenate all rows one by one.
        // Reading row-by-row gives the required zigzag conversion.
        for (StringBuilder row : rows) {
            ans.append(row);
        }

        // Convert StringBuilder to String and return.
        return ans.toString();
    }
}