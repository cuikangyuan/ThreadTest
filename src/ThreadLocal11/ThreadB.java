package ThreadLocal11;

import ThreadLocalTest.Tools;

public class ThreadB extends Thread {
    @Override
    public void run() {

        try {

            for (int i = 0; i < 10; i++) {

                Tools.tl.set("ThreadB-" + (i+1));

                System.out.println("ThreadB get value = " + Tools.tl.get());


                Thread.sleep(200);
            }

        } catch (InterruptedException e) {

            e.printStackTrace();

        }
    }
}
