package com.endava.behavioral.strategy.firstEx;

/**
 * Created by Andrei.Dragutan on 06/03/2017.
 */
public class PaypallStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public PaypallStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
