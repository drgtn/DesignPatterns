package com.endava.behavioral.command.secondEx;

/**
 * Created by Andrei.Dragutan on 29/03/2017.
 */
public class WriteFileCommand implements Command{
    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }

}
