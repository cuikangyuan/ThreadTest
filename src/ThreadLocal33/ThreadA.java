package ThreadLocal33;

public class ThreadA extends Thread {

    @Override
    public void run() {
        try {

            for (int i = 0; i < 10; i++) {


                System.out.println("ThreadA中取值 " + Tools.tl.get());


                Thread.sleep(200);
            }

        } catch (InterruptedException e) {

            e.printStackTrace();

        }
    }
}
