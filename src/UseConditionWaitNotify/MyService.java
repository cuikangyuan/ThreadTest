package UseConditionWaitNotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();

    public Condition condition = lock.newCondition();

    public void await() {

        try {

            lock.lock();

            System.out.println("开始await... time = " + System.currentTimeMillis());
            condition.await();
            System.out.println("结束await... time = " + System.currentTimeMillis());


        } catch (InterruptedException e) {

            e.printStackTrace();
        } finally {
            lock.unlock();
        }



    }

    public void signal() {

        try {

            lock.lock();

            System.out.println("调用signal... time = " + System.currentTimeMillis());

            condition.signal();

        } finally {


            lock.unlock();
        }

    }

}
