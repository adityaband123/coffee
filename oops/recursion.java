package oops;


/*
defination:
           Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve.

factorial of a number: 
                     multiplication of the numbers in reverse order until it become reach to the one
                     ex:  
                       !4 = 4 * 3 * 2 * 1

                       factorial(1)=1

                       factorial(0)=1

                       factorial(5)=5*4*3*2*1=120

                       factorial(n)=n*factorial(n-1)



 */

public class recursion {
    static int factorial(int n) {
        if (n == 0 | n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
            /*
             * return 5 * factorial(5-1) =120 return 4 * factorial(4-1 =24 return 3 *
             * factorial(3-1) =6 return 2 * factorial(2-1) =2 return 1 * factorial(1-1) =1
             * 
             */
        }
    }

    // we also can find factorial fo a number with the help of the iterration:
    static int fact(int n) {
        if (n == 0 | n == 1) {
            return 1;
        } else {
            int product=1;
            for (int i = 1; i <= n; i++) {
                product = product * i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        System.out.println("the factorial of given value is: " + factorial(5));
        System.out.println("the factorial of the given value is: " + fact(5));
    }

}
