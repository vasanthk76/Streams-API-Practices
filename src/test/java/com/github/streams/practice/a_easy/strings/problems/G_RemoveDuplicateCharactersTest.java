package com.github.streams.practice.a_easy.strings.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.streams.practice.a_easy.strings.StringProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

class G_RemoveDuplicateCharactersTest {
  @Test
  @Disabled()
  public void testRemoveDuplicates() {
    final String input = "dabfcadef";
    final String yourSolution = input.chars().distinct().mapToObj(s -> (char) s).map(String::valueOf).reduce("", (a, b) -> a + b);
    final String mySolution = StringProblemsSolution.getUniqueCharacters(input);

    assertEquals(mySolution, yourSolution);
  }
}
