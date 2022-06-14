package com.koendebruijn.portfolio.utils;


public class StringUtils {
    public static boolean isDouble(String string) {
        try {
            double result = Double.parseDouble(string);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
