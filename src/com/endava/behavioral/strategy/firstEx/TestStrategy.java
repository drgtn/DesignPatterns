package com.endava.behavioral.strategy.firstEx;

/**
 * Created by Andrei.Dragutan on 06/03/2017.
 */
public class TestStrategy {
        public static void main(String[] args) {
            ShoppingCard cart = new ShoppingCard();

            Item item1 = new Item("1234",10);
            Item item2 = new Item("5678",40);

            cart.addItem(item1);
            cart.addItem(item2);

            //pay by paypal
            cart.pay(new PaypallStrategy("myemail@example.com", "mypwd"));

            //pay by credit card
            cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
        }
    }

