package joinLong;

import org.omg.CORBA.INTERNAL;

public class MyThread extends Thread {

    @Override
    public void run() {

        try {

            System.out.println("begin Timer = " + System.currentTimeMillis());
            Thread.sleep(5000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }


    }
}
