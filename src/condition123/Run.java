package condition123;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Run {


    volatile private static int nextPrintWho = 1;

    private static ReentrantLock lock = new ReentrantLock();


    final private static Condition conditionA = lock.newCondition();
    final private static Condition conditionB = lock.newCondition();
    final private static Condition conditionC = lock.newCondition();


    public static void main(String[] args) {


        Thread threadA = new Thread() {
            @Override
            public void run() {

                try {

                    lock.lock();

                    while (nextPrintWho != 1) {
                        conditionA.await();
                    }


                    System.out.println("ThreadA >>> 1");

                    nextPrintWho = 2;
                    conditionB.signalAll();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }


            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {

                try {

                    lock.lock();

                    while (nextPrintWho != 2) {
                        conditionB.await();
                    }

                    System.out.println("ThreadB >>> 2");

                    nextPrintWho = 3;
                    conditionC.signalAll();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }


            }
        };

        Thread threadC = new Thread() {
            @Override
            public void run() {

                try {

                    lock.lock();

                    while (nextPrintWho != 3) {
                        conditionC.await();
                    }

                    System.out.println("ThreadC >>> 3");

                    nextPrintWho = 1;
                    conditionA.signalAll();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }


            }
        };

        Thread[] aArray = new Thread[5];
        Thread[] bArray = new Thread[5];
        Thread[] cArray = new Thread[5];

        for (int i = 0; i < 5; i++) {

            aArray[i] = new Thread(threadA);
            bArray[i] = new Thread(threadB);
            cArray[i] = new Thread(threadC);

            aArray[i].start();
            bArray[i].start();
            cArray[i].start();

        }
    }
}
