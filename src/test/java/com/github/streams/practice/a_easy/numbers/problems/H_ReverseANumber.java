package com.github.streams.practice.a_easy.numbers.problems;

import com.github.streams.practice.a_easy.numbers.EasyNumbersProblemSolution;
import com.github.streams.practice.a_easy.numbers.problems.ignore.data.DummyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

class H_ReverseANumber {

  @Test
  @Disabled
  public void reverseANumber() {
    final var input = DummyData.fakerNumber();
    var mySolution = EasyNumbersProblemSolution.reverseANumber(input);
    int yourSolution = IntStream.iterate(input, x->x>0, x->x/10).map(x->x%10).reduce(0,(a,b)->a*10+b);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
