package pipeReaderWriter;

import java.io.*;

public class Run {

    public static void main(String[] args) throws InterruptedException {

        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();

        PipedWriter pipedWriter = new PipedWriter();
        PipedReader pipedReader = new PipedReader();


        try {
            pipedWriter.connect(pipedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ThreadWtire threadWtire = new ThreadWtire(writeData, pipedWriter);

        ThreadRead threadRead = new ThreadRead(readData, pipedReader);


        threadRead.start();


        Thread.sleep(2000);

        threadWtire.start();




    }
}
