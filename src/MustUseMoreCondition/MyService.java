package MustUseMoreCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();

    public Condition conditionA = lock.newCondition();

    public Condition conditionB = lock.newCondition();

    public void awaitA() {

        try {

            lock.lock();
            
            System.out.println("开始awaitA... thread = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());

            conditionA.await();



            System.out.println("结束awaitA... thread = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());

            Thread.sleep(3000);

            System.out.println("run方法结束... thread = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());


        } catch (InterruptedException e) {

            e.printStackTrace();
        } finally {
            lock.unlock();
        }



    }

    public void awaitB() {

        try {

            lock.lock();

            System.out.println("开始awaitB... thread = " + Thread.currentThread().getName());
            conditionB.await();
            System.out.println("结束awaitB... thread = " + Thread.currentThread().getName());


        } catch (InterruptedException e) {

            e.printStackTrace();
        } finally {
            lock.unlock();
        }



    }



    public void signalAll_A() {

        try {

            lock.lock();

            System.out.println("调用signalAllA... time = " + System.currentTimeMillis() + " thread = " + Thread.currentThread().getName());

            conditionA.signalAll();

        } finally {


            lock.unlock();
        }

    }

    public void signalAll_B() {

        try {

            lock.lock();

            System.out.println("调用signalAllB... time = " + System.currentTimeMillis() + " thread = " + Thread.currentThread().getName());

            conditionB.signalAll();

        } finally {


            lock.unlock();
        }

    }

}
