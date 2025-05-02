package edu.canisius.cyb.cyb600.lab2;

public class Task2 {

    public String method1(String input){
        if (input == null || input.isEmpty())return "";
        return new StringBuilder(input.toUpperCase()).reverse().toString();
    }

    public String method2(String input) {
        if (input == null || input.isEmpty()) return "";
        char firstChar = input.charAt(0);
        int length = input.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(firstChar);
        }
        return result.append(input).toString();
    }

    public String method3(String input) {
        if (input == null || input.isEmpty()) return "";
        String[] words = input.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) reversed.append(" ");
        }
        return reversed.toString();
    }
}
