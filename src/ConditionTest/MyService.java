package ConditionTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();

    public Condition condition = lock.newCondition();

    private boolean hasValue = false;


    public void set() {


        try {

            lock.lock();

            while (hasValue == true) {

                condition.await();

            }

            System.out.println("1");
            hasValue = true;
            condition.signal();

            Thread.sleep(2000);


        } catch (InterruptedException e) {

            e.printStackTrace();
        } finally {

            lock.unlock();
        }
    }


    public void get() {


        try {

            lock.lock();

            while (hasValue == false) {

                condition.await();
            }

            System.out.println("0");
            hasValue = false;
            condition.signal();

            Thread.sleep(2000);


        } catch (InterruptedException e) {

            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

}
