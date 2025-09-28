package com.github.streams.practice.a_easy.strings.problems;

import com.github.streams.practice.a_easy.strings.StringProblemsSolution;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class K_FindDuplicateStrings {
  @Test
//  @Disabled
  void findDuplicateStrings() {
    final var input = List.of("Hellow", "World", "How", "are", "you", "How", "are", "you");
    final var mySolution = StringProblemsSolution.findDuplicateStrings(input);
//    final var yourSolution = input.stream()
//            .collect(Collectors.groupingBy(Function.identity())).values().stream()
//            .filter(strings -> strings.size() > 1).map(strings -> strings.get(0))
//            .collect(Collectors.toList());

    final var yourSolution = input.stream()
            .distinct()
            .collect(Collectors.toList());

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
