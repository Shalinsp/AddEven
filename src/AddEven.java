
public class AddEven {

    // Write the logic to add evens in the methods
    public long addEvens(int n) {
        if (n <= 0) {
            return 0; // Base case: Return 0 for non-positive input
        } else if (n % 2 == 0) {
            // Recursive case: Add the current even number (n) and call addEvens for n-2
            return n + addEvens(n - 2);
        } else {
            // Recursive case: If n is odd, call addEvens for n-1
            return addEvens(n - 1);
        }
    }

    public static void main(String[] args) {
        // Initialize the object of AddEven class
        AddEven addEven = new AddEven();

        // Declare a variable to give as input to the addEvens method
        int input1 = 1;
        int input2 = 9;
        int input3 = -9;

        // Call the addEvens method and display the result
        long sum1 = addEven.addEvens(input1);
        long sum2 = addEven.addEvens(input2);
        long sum3 = addEven.addEvens(input3);

        System.out.println("Sum of even numbers up to " + input1 + ": " + sum1);
        System.out.println("Sum of even numbers up to " + input2 + ": " + sum2);
        System.out.println("Sum of even numbers up to " + input3 + ": " + sum3);
    }
}

