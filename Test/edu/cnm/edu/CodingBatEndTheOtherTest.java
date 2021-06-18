package edu.cnm.edu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatEndTheOtherTest {

  private String[][] testParams = {
      {"Hiabc", "abc"},
      {"AbC", "HiaBc"},
      {"abc", "abXabc"},
      {"Hiabc", "abcd"},
      {"Hiabc", "bc"},
      {"Hiabcx", "bc"},
      {"abc", "abc"},
      {"xyz", "12xyz"},
      {"yz", "12xz"},
      {"Z", "12xz"},
      {"12", "12"},
      {"abcXYZ", "abcDEF"},
      {"ab", "ab12"},
      {"ab", "12ab"}
  };

  private boolean[] testExpected = {true, true, true, false, true, false, true, true, false, true,
      true,
      false, false, true};


  @Test
  void test() {
    for (int i = 0; i < testParams.length; i++) {
      boolean actual = CodingBatEndTheOther.endOther(testParams[i][0], testParams[i][1]);
      Assertions.assertEquals(actual, testExpected[i]);
    }
  }

}