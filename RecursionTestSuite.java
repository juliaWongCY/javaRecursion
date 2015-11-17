public class RecursionTestSuite {

  public static void main(String[] args) {
    System.out.println("Running tests...");

    gcdTests();
    isPrimeTests();
    sumSquareDigitsTests();
    isHappyTests();
    isCarmichaelTests();

    System.out.println("...tests complete.");
  }

  public static void gcdTests() {
    checkGCD(12, 16, 4);
    checkGCD(33, 36, 3);
    checkGCD(15, 90, 15);
    checkGCD(14, 7, 7);
    checkGCD(56, 24, 8);
    
  }

  public static void isPrimeTests() {
    checkIsPrime(9, false);
    checkIsPrime(11, true);
    checkIsPrime(1327, true);
    checkIsPrime(4723, true);
    checkIsPrime(3388, false);
    
  }

  public static void sumSquareDigitsTests() {
    checkSumSquareDigits(10, 1);
    checkSumSquareDigits(103, 10);
    checkSumSquareDigits(123, 14);
    checkSumSquareDigits(223, 17);
    checkSumSquareDigits(451, 42);
    
  }

  public static void isHappyTests() {
    checkIsHappy(397, true);
    checkIsHappy(123, false);
    checkIsHappy(97, true);
    checkIsHappy(20, false);
    checkIsHappy(139, true);
  }


  public static void isCarmichaelTests() {
    checkIsCarmichael(3, false);
    checkIsCarmichael(561, true);
    checkIsCarmichael(1105, true);
    checkIsCarmichael(17, false);
    checkIsCarmichael(341, false);
  }



  private static void checkGCD(int x, int y, int expected) {
    int actual = RecursionLibrary.greatestCommonDivisor(x, y);
    if (actual != expected) {
      System.out.println("greatestCommonDivisor(" + x + ", " + y + "); expected: "
          + expected + ", got: " + actual);
    }
  }

  private static void checkIsPrime(int value, boolean expected) {
    boolean actual = RecursionLibrary.isPrime(value);
    if (actual != expected) {
      System.out.println("isPrime(" + value + "); expected: " + expected
          + ", got: " + actual);
    }
  }

  private static void checkSumSquareDigits(int n, int expected) {
    int actual = RecursionLibrary.sumSquareDigits(n);
    if (actual != expected) {
      System.out.println("sumSquareDigits(" + n + "); expected: "
          + expected + ", got: " + actual);
    }
  }

  private static void checkIsHappy(int n, boolean expected) {
    boolean actual = RecursionLibrary.isHappy(n);
    if (actual != expected) {
      System.out.println("isHappy(" + n + "); expected: " + expected
          + ", got: " + actual);
    }
  }
  
  private static void checkIsCarmichael(int n, boolean expected) {
    boolean actual = RecursionLibrary.isCarmichael(n);
    if (actual != expected) {
       System.out.println("isCarmichael(" + n + "); expected : " + expected
           + ", got: " + actual);
    }
  }
}
