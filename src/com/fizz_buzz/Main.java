// TODO: 1から100までの数字を印刷するプログラムを書く
//       3の正確な倍数である数値、または3を含む数値は、"...Fizz..."を含む文字列を表示する必要があります。
//            For example 9 -> "...Fizz..."
//            For example 31 -> "...Fizz..."
//       5の倍数と正確に一致する数値、または5を含む数値は、"...Buzz..."を含む文字列を表示する必要があります。
//            For example 10 -> "...Buzz..."
//            For example 51 -> "...Buzz..."

package com.fizz_buzz;

public class Main {
    public static void main(String[] args) {
        for (String el : FizzBuzz.fizzBuzz()) {
            System.out.println(el);
        }
    }
}