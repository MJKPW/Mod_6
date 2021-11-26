package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("Basic text", (text)->text.substring(0, text.length()/2)));
        System.out.println(poemBeautifier.beautify("Basic text", (text)->text.substring(text.length()/2)));
        System.out.println(poemBeautifier.beautify("Basic text", (text)->"@@"+text+"@@"));
        System.out.println(poemBeautifier.beautify("Basic text", String::toUpperCase));
    }
}