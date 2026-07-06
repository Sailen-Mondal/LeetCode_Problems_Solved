import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> generate(int numRows) {

        // Stores the complete Pascal's Triangle
        List<List<Integer>> result = new ArrayList<>();

        // Generate each row
        for (int i = 0; i < numRows; i++) {

            // Create a new row
            List<Integer> row = new ArrayList<>();

            // Fill the current row
            for (int j = 0; j <= i; j++) {

                // First and last elements are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {

                    // Sum of the two numbers directly above
                    int sum = result.get(i - 1).get(j - 1)
                            + result.get(i - 1).get(j);

                    row.add(sum);
                }
            }

            // Add the completed row to the result
            result.add(row);
        }

        return result;
    }
}