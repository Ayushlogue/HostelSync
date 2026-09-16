package com.hostelsync.util;

import java.time.LocalDateTime;

public class LoggerUtil {

    public static void info(String message) {
        System.out.println(
                "[" + LocalDateTime.now() + "] INFO: " + message
        );
    }

    public static void error(String message) {
        System.err.println(
                "[" + LocalDateTime.now() + "] ERROR: " + message
        );
    }
}