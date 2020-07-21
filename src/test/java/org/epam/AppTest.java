package org.epam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

public class AppTest {

    Average average;
    Palindrome palindrome;
    CheckStart checkStart;

    @BeforeEach
    void setUp() {
        average = new Average();
        palindrome = new Palindrome();
        checkStart = new CheckStart();
    }

    @Test
    void checkStartsWith() {
        String[] ans = checkStart.getStringStartsWith("ace", "racecar", "are", "laptop", "kayak");
        StringBuilder sb = new StringBuilder();
        Arrays.stream(ans).forEach(i -> sb.append(i).append(" "));
        assertEquals("ace are", sb.toString().trim());
    }
    @Test
    void checkStartsWithNullList() {
        String[] ans = checkStart.getStringStartsWith("");
        StringBuilder sb = new StringBuilder();
        Arrays.stream(ans).forEach(i -> sb.append(i).append(" "));
        assertEquals("", sb.toString().trim());
    }
    @Test
    void setCheckStartWithNullArgs() {
        String[] ans = checkStart.getStringStartsWith();
        StringBuilder sb = new StringBuilder();
        Arrays.stream(ans).forEach(i -> sb.append(i).append(" "));
        assertEquals("", sb.toString().trim());
    }

    @Test
    void checkAverage() {
        assertEquals(5.5, average.getAverage(5,1,9,7));
    }
    @Test
    void checkAverageNullArgs() {
        assertEquals(0.0, average.getAverage());
    }
    @Test
    void checkAverageSingleArgs() {
        assertEquals(5.0, average.getAverage(5));
    }

    @Test
    void checkPalindromesNullArgs() {
        String[] ans = palindrome.getPalindromes();
        StringBuilder sb = new StringBuilder();
        Arrays.stream(ans).forEach(i -> sb.append(i).append(" "));
        assertEquals("", sb.toString().trim());
    }
    @Test
    void checkPalindromesWithArgs() {
        String[] ans = palindrome.getPalindromes("baab", "racecar", "car", "laptop", "kayak");
        StringBuilder sb = new StringBuilder();
        Arrays.stream(ans).forEach(i -> sb.append(i).append(" "));
        assertEquals("baab racecar kayak", sb.toString().trim());
    }


}