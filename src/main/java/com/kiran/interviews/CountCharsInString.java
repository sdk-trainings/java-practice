package com.kiran.interviews;

import java.util.HashMap;
import java.util.Map;

public class CountCharsInString {

    public static void printCharFreq(String str){
        Map<Character, Integer> freq = new HashMap<>();
        for(char c:str.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        System.out.println(freq);
    }

    public static void main(String[] args) {
        printCharFreq("noon");
    }

}
