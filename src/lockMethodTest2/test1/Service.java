package lockMethodTest2.test1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

    public ReentrantLock lock = new ReentrantLock();

    public Condition condition = lock.newCondition();

    public void waitMethod() {

        try {

            lock.lock();

            //condition.await();

            Thread.sleep(Integer.MAX_VALUE);

        } catch (InterruptedException e) {

            e.printStackTrace();

        } finally {
            lock.unlock();
        }

    }


    public void notifyMethod() {

        try {

            lock.lock();

            System.out.println("有" + lock.getWaitQueueLength(condition) + "个线程在等待condition");

            condition.signal();

            System.out.println("调用signal后，有" + lock.getWaitQueueLength(condition) + "个线程在等待condition");



        } finally {

            lock.unlock();

        }
    }

}
