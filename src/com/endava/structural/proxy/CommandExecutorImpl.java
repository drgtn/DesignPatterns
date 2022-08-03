package com.endava.structural.proxy;

import java.io.IOException;

/**
 * Created by Andrei.Dragutan on 28/03/2017.
 */
public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws IOException {
        //some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }

}
