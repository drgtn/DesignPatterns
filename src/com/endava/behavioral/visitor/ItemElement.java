package com.endava.behavioral.visitor;

/**
 * Created by Andrei.Dragutan on 06/04/2017.
 */
public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
