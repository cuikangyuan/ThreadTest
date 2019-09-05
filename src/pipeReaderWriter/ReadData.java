package pipeReaderWriter;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedReader;

public class ReadData {

    public void readMethod(PipedReader pipedReader) {

        try {

            System.out.println("read :");

            char[] chars = new char[20];

            int readLength = pipedReader.read(chars);

            while (readLength != -1) {

                String newData = new String(chars, 0, readLength);
                System.out.print(newData);

                readLength = pipedReader.read(chars);

            }

            System.out.println("");

            pipedReader.close();

        } catch (IOException e) {

            e.printStackTrace();

        }





    }
}
