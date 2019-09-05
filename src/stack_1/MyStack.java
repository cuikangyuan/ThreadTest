package stack_1;

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

                this.notify();

                try {
                    Thread.sleep(2000);
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

                this.wait();

            } else {


                returnValue = list.get(0) + "";

                System.out.println("pop = " + list.get(0));

                list.clear();

                this.notify();

                try {
                    Thread.sleep(2000);
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
