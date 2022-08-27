package com.kiran.interviews;

import org.apache.commons.lang3.StringUtils;

public class PrintCharsOnCount {

    public static void printChars(String input) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < input.length(); i = i + 2)
            for (int j = 1; j <= Integer.parseInt(input.substring(i + 1, i + 2)); j++)
                str.append(input.charAt(i));
        System.out.println(str);
    }

    public static void printChars1(String input) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < input.length(); i = i + 2)
            str.append(StringUtils.repeat(input.charAt(i), Integer.parseInt(input.substring(i + 1, i + 2))));
        System.out.println(str);
    }

    public static void main(String[] args) {
        printChars1("a4b2c5");
    }

}
