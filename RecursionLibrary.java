public class RecursionLibrary {

  public static int greatestCommonDivisor (int x, int y) {
    assert (x != 0 && y != 0) :
       "The two integers must be non-zero.";
    return gcdHelper (Math.abs(x), Math.abs(y));
  }

  private static int gcdHelper (int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return gcdHelper (b, (a % b));
    }
  }


  public static boolean isPrime (int n) {
    assert (n > 0) : 
       "n must be a non-negative integer.";
    if (n < 2 || (n % 2 == 0) && n != 2) {
      return false;
    } else {
      return checkPrime (n, 3);
    }
  }

   private static boolean checkPrime (int n, int a) {
     if (a > Math.sqrt(n)) {
       return true;
     } else if (n % a == 0) {
       return false;
     } else {
       return checkPrime (n, a + 2);
     } 
  }


  public static int sumSquareDigits (int n) {
    assert (n >= 0) : 
      "n is a non-negative integer.";
    if (n < 10) {
      return n * n;
    } else {
      return sumSquareDigits (n / 10) + ((n % 10) * (n % 10));
    }
  }


  public static boolean isHappy (int n) {
    assert (n > 0) : 
      "n must be positive.";
      return isItHappy (n, 0, 0, 0);
  }

   private static boolean isItHappy (int n, int r, int t, int nt) {
     if (n == 1) {
       return true;
     } else if (n == r) {
       return false;
     } else if (t > 0) {
       return isItHappy ((sumSquareDigits (n)), r, (t - 1), nt);
     } else if (t == 0) {
       return isItHappy ((sumSquareDigits (n)), n, nt, (nt + 1));
     } else {
       return true;
     }
  }
  

  private static int modPow (int x, int y, int n){
    if (y == 0) {
      return (1 % n);
     } else if (y % 2 == 0) {
       return ((modPow (x, (y / 2), n)) * (modPow (x, (y / 2), n))) % n;
     } else {
       return ((x % n) * (modPow (x, (y - 1), n))) % n;
     }
}
  public static boolean isCarmichael (int n) {
   assert (n > 0) : 
     "n is positive.";
     return isCarmichaelHelper (2, n);
  }

  private static boolean isCarmichaelHelper (int a, int n) {
    if (n == a) {
      return true;
    } else if (isPrime (n)) {
      return false;
    } else if (modPow (a, n, n) != a) {
      return false;
    } else {
      return isCarmichaelHelper ((a + 1), n);
    }
  }


}

