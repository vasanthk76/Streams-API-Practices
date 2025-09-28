package com.github.streams.practice.a_easy.strings.problems;

import com.github.streams.practice.b_medium.ProblemSolutions;
import net.datafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given A String
 * Find the highest number of vowels present in a word.
 *
 * Example:
 * INPUT: HELLO HOW ARE YOU
 * OUTPUT: 2
 * EXPLANATION: HELLO contains 2 vowels.
 * */
class P_WordWithMaxNumberOfVowelsTest {

  @Disabled
  @Test
  void testNumberOfVowels() {
    var input = new Faker().chuckNorris().fact();
    final var mySolution = ProblemSolutions.maxNumberOfVowels(input);
    final var yourSolution = Arrays.stream(input.split(" "))
                    .map(x->x.length()-x.replaceAll("[aeiouAEIOU]", "").length())
                            .max(Comparator.comparing(Integer::intValue)).get();
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
