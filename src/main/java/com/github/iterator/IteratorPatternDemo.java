package com.github.iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository names = new NameRepository();
        for (Iterator<String> iterator = names.iterator(); iterator.hasNext();)
            System.out.println(iterator.next());
    }

}
