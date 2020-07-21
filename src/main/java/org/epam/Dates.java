package org.epam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Dates {
    public static void main(String[] args) {
        String[] dates = { "24 Jul 2017", "25 Jul 2017", "11 Jun 1996", "01 Jan 2019", "12 Aug 2005", "01 Jan 1997" };
        Arrays.stream(dates)
                .map(i -> LocalDate.parse(i, DateTimeFormatter.ofPattern("dd MMM yyyy")))
                .sorted()
                .map(i -> i.format(DateTimeFormatter.ofPattern("dd MMM yyyy")))
                .forEach(System.out::println);

    }
}