package com.github.streams.practice.a_easy.strings.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.streams.practice.a_easy.strings.StringProblemsSolution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class D_NumberOfOccurencesOfEachCharacterTest {
  @Test
//  @Disabled("Remove This Once you Complete The Exercise")
  void numberOfOccurencesOfEachCharacter() {
    final String input = "the quick brown fox jumps right over the little lazy dog little";
    final var mySolution = StringProblemsSolution.findOccurenceOfCharacter(input);
    final Map<Character, Long> yourSolution = input.chars().mapToObj(c->(char)c)
            .filter(s->!Character.isSpaceChar(s))
            .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.reducing(0L,e->1L,Long::sum)));

    assertEquals(mySolution, yourSolution);
  }
}
