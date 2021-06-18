package edu.cnm.edu;

/*

Given two strings, return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */

public class CodingBatEndTheOther {

  public static void main(String[] args) {
    System.out.printf("with the Strings %s and %s, the outcome is " + endOther("Hiabc", "abc")
    + ".\n", "Hiabc", "abc");
    System.out.printf("with the Strings %s and %s, the outcome is " + endOther("AbC", "HiaBc")
        + ".\n", "AbC", "HiaBc");
    System.out.printf("with the Strings %s and %s, the outcome is " + endOther("abc", "abXabc")
        + ".\n", "abc", "abXabc");
  }

  public static boolean endOther(String a, String b) {

    if (a.length() >= b.length()) {
      return ((a.substring(a.length() - b.length(), a.length()).toLowerCase())
          .equals(b.toLowerCase()));

    }
    return ((b.substring(b.length() - a.length(), b.length()).toLowerCase())
        .equals(a.toLowerCase()));


  }

}
