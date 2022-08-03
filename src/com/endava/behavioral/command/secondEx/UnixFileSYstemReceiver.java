package com.endava.behavioral.command.secondEx;

/**
 * Created by Andrei.Dragutan on 29/03/2017.
 */
public class UnixFileSYstemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening file in Unix");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Unix");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Unix");
    }
}
