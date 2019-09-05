package pipeReaderWriter;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedWriter;

public class WriteData {

    public void writeMethod(PipedWriter pipedWriter) {

        try{

            System.out.println("write :");

            for (int i = 0; i < 10; i++) {

                String outDate = "" + (i+1);

                pipedWriter.write(outDate);

                System.out.print(outDate);

            }
            System.out.println("");

            pipedWriter.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
