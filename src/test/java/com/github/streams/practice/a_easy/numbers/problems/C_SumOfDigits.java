package com.github.streams.practice.a_easy.numbers.problems;

import com.github.streams.practice.a_easy.numbers.EasyNumbersProblemSolution;
import com.github.streams.practice.a_easy.numbers.problems.ignore.data.DummyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Calculates the sum of digits of a given integer.
 *
 * <p>This method takes an integer as input, breaks it down into individual digits, and returns
 * their sum.
 *
 * <p>Example: <br>
 * Input = 123<br>
 * Output = 6 <br>
 * Explanation: (1 + 2 + 3)
 */
class C_SumOfDigits {

  @Test
//  @Disabled
  void testSumOfDigits() {
    final var input = DummyData.fakerNumber();
    var mySolution = EasyNumbersProblemSolution.sumOfDigits(input);
    var yourSolution = IntStream.iterate(input, i->i>0, i->i/10).map(n->n%10).sum();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
