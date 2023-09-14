package ru.maxim.tconsaltingtesttaskbackend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LetterServiceTest {
    private LetterService underTest = new LetterService();


    @Test
    void getAmountOfEachLetter() {
        // Arrange
        String input = "aabaccacca";
        String expectedOutput = "“a”: 5, “c”: 4, “b”: 1";

        // Act
        String actualOutput = underTest.getAmountOfEachLetter(input);

        // Assert
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}