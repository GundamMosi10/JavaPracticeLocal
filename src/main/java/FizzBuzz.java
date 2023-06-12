public class FizzBuzz {
    public static void main(String[] args) {
        int n = 100; //set the value of n

        for (int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(" FizzBuzz ");
            } else if (i % 3 == 0){
                System.out.print(" Fizz ");
            } else if ( i % 5 == 0){
                System.out.print(" Buzz ");
            } else {
                System.out.print(" " + i);
            }
        }
    }
}

//In the main method, we define the value of n as 100, which represents the range of numbers from 1 to 100.
//We use a for loop to iterate from 1 to m. For each interation, we check if the current number i is divisible
// by both 3 and 5. If it is, we print 'FizzBuzz' if not we check if I is divisible by 3 which we print 'Fizz' if it
//is and if it is divisible by 5 we print 'Buzz'. If it cannot be divisible by either of those numbers we print the
//number i.
