package com.endava.behavioral.mediator.firstEx;

/**
 * Created by Andrei.Dragutan on 31/03/2017.
 */
public interface ChatMediator {
    void showMessage(String msg, User user);
    void addUser(User user);
}
