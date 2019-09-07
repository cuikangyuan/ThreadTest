package ThreadLocal11;


import s5.Tools;

import java.util.Date;

public class ThreadA extends Thread {

    @Override
    public void run() {


        try {

            for (int i = 0; i < 10; i++) {

                ThreadLocalTest.Tools.tl.set("ThreadA-" + (i+1));

                System.out.println("ThreadA get value = " + ThreadLocalTest.Tools.tl.get());


                Thread.sleep(200);
            }



        } catch (InterruptedException e) {

            e.printStackTrace();

        }



    }
}
