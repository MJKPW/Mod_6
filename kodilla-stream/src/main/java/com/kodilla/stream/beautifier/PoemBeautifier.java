package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String text, PoemDecorator beautifier){
        return beautifier.decorate(text);
    }
}
