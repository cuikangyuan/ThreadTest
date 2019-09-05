package stack_old;

import p_c_allWait_fix.ValueObject;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private List list = new ArrayList();


    synchronized public void push() {

        try{

            if (list.size() == 1) {

                this.wait();

            } else {


                double random = Math.random();

                list.add(random);

                System.out.println("push = " + random);

                this.notifyAll();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

    synchronized public String pop() {

        String returnValue = "";

        try{

            if (list.size() == 0) {

                System.out.println("C" + Thread.currentThread().getName() + " >>> Waiting");

                this.wait();

            } else {


                returnValue = list.get(0) + "";

                //System.out.println("pop = " + list.get(0));


                System.out.println("C" + Thread.currentThread().getName() + " >>> Runnable " + " get的值是 " + returnValue);


                list.clear();

                this.notifyAll();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        return returnValue;

    }


}
