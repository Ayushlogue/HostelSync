package com.hostelsync.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static String getCurrentDate() {
        return LocalDate.now().format(FORMATTER);
    }

    public static LocalDate parseDate(String date) {
        return LocalDate.parse(date, FORMATTER);
    }

    public static String formatDate(LocalDate date) {
        return date.format(FORMATTER);
    }
}