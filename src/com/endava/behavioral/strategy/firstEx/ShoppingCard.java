package com.endava.behavioral.strategy.firstEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Andrei.Dragutan on 06/03/2017.
 */
public class ShoppingCard {
    private List<Item> items;

    public ShoppingCard() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        return items.stream().collect(Collectors.summingInt(Item::getPrice));
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calculateTotal());
    }
}
