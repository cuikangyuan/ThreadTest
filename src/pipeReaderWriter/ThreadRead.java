package pipeReaderWriter;

import java.io.PipedInputStream;
import java.io.PipedReader;

public class ThreadRead extends Thread {


    private ReadData readData;

    private PipedReader pipedReader;

    public ThreadRead(ReadData readData, PipedReader pipedReader) {
        this.readData = readData;
        this.pipedReader = pipedReader;
    }


    @Override
    public void run() {
        readData.readMethod(pipedReader);
    }
}
