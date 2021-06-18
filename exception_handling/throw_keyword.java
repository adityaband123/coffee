package exception_handling;

/*
The throws keyword in Java is used to declare exceptions that can occur during the execution of a program


with the help of the throw keyword user can throw his own exceptions

*/

class Main {
    public static void divideByZero() {
      throw new ArithmeticException("Trying to divide by 0");
    }
  
    public static void main(String[] args) {
      divideByZero();
    }
  }
  
  
