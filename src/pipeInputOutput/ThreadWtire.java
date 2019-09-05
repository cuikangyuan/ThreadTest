package pipeInputOutput;

import java.io.OutputStreamWriter;
import java.io.PipedOutputStream;

public class ThreadWtire extends Thread {


    private WriteData writeData;


    private PipedOutputStream pipedOutputStream;


    public ThreadWtire(WriteData writeData, PipedOutputStream pipedOutputStream) {
        this.writeData = writeData;
        this.pipedOutputStream = pipedOutputStream;
    }


    @Override
    public void run() {

            writeData.writeMethod(pipedOutputStream);
    }
}
