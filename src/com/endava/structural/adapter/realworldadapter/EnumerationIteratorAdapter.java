package com.endava.structural.adapter.realworldadapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Andrei.Dragutan on 13/03/2017.
 */
public class EnumerationIteratorAdapter implements Enumeration {
    Iterator iterator;

    public EnumerationIteratorAdapter(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
