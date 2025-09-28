package com.github.streams.practice.a_easy.strings.problems;

import com.github.streams.practice.b_medium.ProblemSolutions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Given a String find the first non-repeating character:
 *
 * String = The quick brown fox jumps over the lazy dog, find the first non-repeated character.
 * (Google interview)
 */
class N_FirstNonRepeatingCharacterTest {
    @Test
//    @Disabled
    void testFirstNonRepeatingCharacter() {
        final var input =
                "The quick brown fox jumps over the lazy dog, find the first non repeated character.";
        final var mySolution = ProblemSolutions.firstNonRepeatingCharacter(input);
        final var yourSolution = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c->input.indexOf(c) == input.lastIndexOf(c))
                        .findFirst().get();

        Assertions.assertEquals(mySolution, yourSolution);
    }
}
