package com.github.streams.practice.a_easy.strings.problems;

import com.github.streams.practice.a_easy.strings.StringProblemsSolution;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class F_ConcatenationOfStrings {
  /**
   * Given a list of strings, write a method to concatenate all the strings in the list, separated
   * by a comma, using Java 8 Streams.
   */
  @Test
//  @Disabled
  void testConcatenationOfStrings() {
    List<String> input = List.of("Hellow", "World", "Hello", "World");
    final var mySolution = StringProblemsSolution.concatenateStrings(input);
    final var yourSolution = String.join(",", input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
