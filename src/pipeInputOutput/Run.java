package pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {

    public static void main(String[] args) throws InterruptedException {

        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();


        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream();


        try {
            pipedOutputStream.connect(pipedInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ThreadWtire threadWtire = new ThreadWtire(writeData, pipedOutputStream);

        ThreadRead threadRead = new ThreadRead(readData, pipedInputStream);


        threadRead.start();


        Thread.sleep(2000);

        threadWtire.start();




    }
}
