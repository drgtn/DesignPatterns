package com.endava.behavioral.command.secondEx;

//Invoker is a simple class that encapsulates the Command and passes the request to the command object to process it.
public class FIleInvoker {
    Command command;

    public FIleInvoker(Command command) {
        this.command = command;
    }

    public void execute(){
        this.command.execute();
    }


    public static void main(String[] args) {
        String test=String.format("%s%s","aaa","bbb");
        System.out.println(test);
    }
}
