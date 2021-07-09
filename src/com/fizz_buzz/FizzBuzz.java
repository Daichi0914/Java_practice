package com.fizz_buzz;

public class FizzBuzz {
    static String[] fizzBuzz() {
        String fizz = "...Fizz...";
        String buzz = "...Buzz...";

        String[] arr;
        arr = new String[100];

        for (int i = 1; i < 101; i++) {
            String s = String.valueOf(i);
            if (i % 3 == 0 && i % 5 == 0) {
                arr[i - 1] = fizz + buzz;
            } else if (s.contains("3") && s.contains("5")) {
                arr[i - 1] = fizz + buzz;
            } else if (s.contains("3")) {
                arr[i - 1] = fizz;
            } else if (s.contains("5")) {
                arr[i - 1] = buzz;
            } else if (i % 3 == 0) {
                arr[i - 1] = fizz;
            } else if (i % 5 == 0) {
                arr[i - 1] = buzz;
            } else {
                arr[i - 1] = s;
            }
        }
        return arr;
    }
}