package com.github.streams.practice.a_easy.strings.problems;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class M_UpperCaseOddLengthWords {

  /**
   * Given a list of words, create an output list that contains only the odd-length words, converted
   * to upper case.
   */
  @Test
//  @Disabled
  public void uppercaseOddLengthWords() {
    List<String> input = List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot");

    List<String> result = input.stream().map(String::toUpperCase).collect(Collectors.toList()); // TODO

    Assertions.assertEquals(List.of("ALHA","BRAVO", "CHARLIE", "DELTA", "ECHO","FOXTROT"), result);
  }
}
