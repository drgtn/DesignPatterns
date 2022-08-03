package com.endava.structural.adapter.realworldadapter;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Andrei.Dragutan on 13/03/2017.
 */
public class TestAnumIterAdapter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AAA", "BBB");

        Enumeration<String> enumIterator = new EnumerationIteratorAdapter(list.iterator());
        while (enumIterator.hasMoreElements()){
            System.out.println(enumIterator.nextElement());
        }
    }
}
