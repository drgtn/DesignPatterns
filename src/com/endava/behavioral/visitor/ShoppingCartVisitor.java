package com.endava.behavioral.visitor;

/**
 * Created by Andrei.Dragutan on 06/04/2017.
 */
public interface ShoppingCartVisitor {
    int visit (Book book);
    int visit(Fruit fruit);
}
