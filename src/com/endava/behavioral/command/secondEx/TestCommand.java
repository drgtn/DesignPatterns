package com.endava.behavioral.command.secondEx;

/**
 * Created by Andrei.Dragutan on 29/03/2017.
 */
public class TestCommand {
    public static void main(String[] args) {
        //Creating the Receiver
        FileSystemReceiver receiver=new UnixFileSYstemReceiver();

        //Creating Command and associte with Receiver
        Command command=new OpenFileCommand(receiver);

        //Creating invokerand associating it with Command
        FIleInvoker invoker=new FIleInvoker(command);
        invoker.execute();
    }

}
