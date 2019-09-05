package pipeReaderWriter;

import java.io.PipedOutputStream;
import java.io.PipedWriter;

public class ThreadWtire extends Thread {


    private WriteData writeData;


    private PipedWriter pipedWriter;


    public ThreadWtire(WriteData writeData, PipedWriter pipedWriter) {
        this.writeData = writeData;
        this.pipedWriter = pipedWriter;
    }


    @Override
    public void run() {

            writeData.writeMethod(pipedWriter);
    }
}
