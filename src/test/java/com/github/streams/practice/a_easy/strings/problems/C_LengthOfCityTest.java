package com.github.streams.practice.a_easy.strings.problems;

import com.github.streams.practice.a_easy.strings.StringProblemsSolution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Calculates the length of city names that start with 'm' or 'M'. <br>
 * <br>
 *
 * <h3>Example Cities</h3>
 *
 * <ul>
 *   <li>Mumbai
 *   <li>Munnar
 *   <li>Chennai
 *   <li>Hyderabad
 * </ul>
 */
class C_LengthOfCityTest {
  @Test
//  @Disabled
  void testCalculateLengthOfEachCityTest() {
    final var cities = List.of("Mumbai", "Munnar", "Chennai", "Hyderabad");
    final var mySolution = StringProblemsSolution.findLengthOfEachCityAlongWithSize(cities);

    final Map<String, Integer> yourSolution = cities.stream().filter(s->s.charAt(0)=='m'||s.charAt(0)=='M')
            .collect(Collectors.toMap(Function.identity(), String::length));
    Assertions.assertEquals(yourSolution, mySolution);
  }
}
