package com.github.streams.practice.a_easy.strings.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.streams.practice.a_easy.strings.StringProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class I_SecondHighestWordTest {
  @Test
  @Disabled()
  public void find2ndHighestWord() {
    final String input = "I am interested123455 to grow in my organization";
    String mySolution = StringProblemsSolution.find2ndLargestWordInTheString(input);

    final String yourSolution = Arrays.stream(input.split(" "))
            .sorted(Comparator.comparing(String::length, Comparator.reverseOrder()))
            .skip(1)
            .limit(1).findFirst().get();
//
//    String yourSolution = Arrays.stream(input.split(" "))
//            .sorted(Comparator.comparing(String::length, Comparator.reverseOrder()))
//            .skip(1)
//            .limit(1)
//            .findFirst()
//            .orElseThrow(RuntimeException::new);

    assertEquals(mySolution, yourSolution);
  }
}
