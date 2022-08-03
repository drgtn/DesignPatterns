package com.endava.behavioral.mediator.firstEx;

/**
 * Created by Andrei.Dragutan on 31/03/2017.
 */
public class UserImpl extends User {
    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name+": Sending Message="+msg);
        mediator.showMessage(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message:"+msg);
    }
}
