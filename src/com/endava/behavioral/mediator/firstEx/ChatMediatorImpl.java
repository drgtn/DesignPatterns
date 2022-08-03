package com.endava.behavioral.mediator.firstEx;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrei.Dragutan on 31/03/2017.
 */
public class ChatMediatorImpl implements ChatMediator {
    List<User> users;

    public ChatMediatorImpl() {
       users=new ArrayList<>();
    }


    @Override
    public void showMessage(String msg, User user) {
        for (User u : this.users) {
            //message should not be received by the user that is sending it
            if (u!=user){
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
