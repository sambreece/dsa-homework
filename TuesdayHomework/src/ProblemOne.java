public class ProblemOne {
  //1.	Given an integer n, return true if it is a power of four. Otherwise, return false.
  // An integer n is a power of four, if there exists an integer x such that n == 4x.
  // Implement the solution recursively

  public static void main(String[] args) {
    ProblemOne problem = new ProblemOne();
    System.out.println("5 " + problem.checkIfPowerOfFour(5));
    System.out.println("16 " + problem.checkIfPowerOfFour(16));
    System.out.println("64 " + problem.checkIfPowerOfFour(64));
  }

  public boolean checkIfPowerOfFour(int input) {
    boolean result = false;

    if(input == 1) {
      result =  true;
    } else if ( input % 4 == 0) {
      result =  checkIfPowerOfFour(input/4);
    }
    return result;
  }
}
