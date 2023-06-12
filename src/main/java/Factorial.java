public class Factorial {
    public static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
}
//The factorial of a non-negative integer n is the product of all positive integers from 1 to n.
//The factorial method takes an integer n as input and recursively calculates the factorial of
// n. The base case is when n is 0 or 1, in which case the method returns 1. Otherwise, it recursively
// calls itself with n-1 and multiplies the result by n. This process continues until the base case is reached.

//In the example above, we calculate the factorial of the number 5 using the factorial method and print
// the result. 