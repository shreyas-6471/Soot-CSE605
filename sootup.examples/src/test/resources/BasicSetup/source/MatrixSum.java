public class Main {
    public static void main(String[] args) {

        // declare and initialize the 2D matrix
        int[][] inputMatrix = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        // Call the user-defined method to get the sum of all elements
        int sum = sumOfMatElmt(inputMatrix);

        // Print the result
        System.out.println("Sum of matrix elements: " + sum);
    }

    //user-defined method to find the sum of the elements
    public static int sumOfMatElmt(int[][] mat) {

        // declare and initialize the sum variable
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {

            // initiate the looping over each column of the current row
            for (int j = 0; j < mat[i].length; j++) {

                // Add the current element to the sum
                sum += mat[i][j];
            }
        }

        // Return the result
        return sum;
    }
}