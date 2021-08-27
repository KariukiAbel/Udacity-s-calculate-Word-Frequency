package com.nabesh;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class CalculateWordFrequency {

    public static void calculateWordsFrequency(List<String> input){
        TreeMap<String, Integer> freqmap = new TreeMap<String, Integer>();
        for (String str:input) {
            freqmap.put(str, freqmap.getOrDefault(str, 0) + 1);

        }
        for (String word:freqmap.keySet()
             ) {
            System.out.println(word + "|" + freqmap.get(word));
        }
    }

    public static void main(String[] args) {
	// write your code here
        calculateWordsFrequency(Arrays.asList("abc", "bcd", "abc"));
    }
}
