package com.endava.behavioral.command.secondEx;

/**
 * Created by Andrei.Dragutan on 29/03/2017.
 */
public class OpenFileCommand implements Command {
    FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.openFile();
    }
}
