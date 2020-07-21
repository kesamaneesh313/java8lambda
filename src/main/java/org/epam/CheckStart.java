package org.epam;

import java.util.*;
import java.util.function.Predicate;

public class CheckStart {

    public String[] getStringStartsWith(String... args) {
        return Arrays.stream(args).filter(check).toArray(String[]::new);
    }
    private static Predicate<String> check = string -> string.startsWith("a") && string.length() == 3;
}
