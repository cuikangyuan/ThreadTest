package stack_new_final;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private List list = new ArrayList();


    synchronized public void push() {

        try{

            if (list.size() == 1) {

                System.out.println("P" + Thread.currentThread().getName() + " >>> Waiting");

                this.wait();

            } else {


                double random = Math.random();

                list.add(random);

                System.out.println("P" + Thread.currentThread().getName() + " >>> Runnable " + "push : " + random);


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


                System.out.println("C" + Thread.currentThread().getName() + " >>> Runnable " + " pop: " + returnValue);


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
