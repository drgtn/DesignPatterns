package com.endava.behavioral.visitor;

/**
 * Created by Andrei.Dragutan on 06/04/2017.
 */
public class TestVisitor {
    public static void main(String[] args) {
        ItemElement [] items=new ItemElement[]{new Book(20, "1234"),new Book(100, "5678"),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};
        int total=calculateTotal(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculateTotal(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum=0;
        for (ItemElement element :items) {
            sum=sum+element.accept(visitor);
        }
        return sum;
    }
}
