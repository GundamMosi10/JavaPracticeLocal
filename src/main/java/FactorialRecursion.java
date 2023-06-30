public class FactorialRecursion {
    public static void main(String[] args) {
        int number = 5;
        long factorial = computeFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    public static long computeFactorial(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * computeFactorial(n - 1 );
        }
    }
}

//In this program, the computeFactorial method calculates the factorial of a given
// number using recursion without the use of loops. The base case is when n is equal to 0,
// in which case it returns 1 (since the factorial of 0 is defined as 1).
// Otherwise, it multiplies n with the factorial of n-1. This recursive process continues
// until the base case is reached.