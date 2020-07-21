package org.epam;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Palindrome {

    public static Predicate<String> isItPalindrome = string -> {
        String temp = string.toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    };

    public String[] getPalindromes(String... args) {
        return Arrays.stream(args).filter(isItPalindrome).toArray(String[]::new);
    }
}
