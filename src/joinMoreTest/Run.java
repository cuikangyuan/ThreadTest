package joinMoreTest;

import join_sleep_2.ThreadC;

public class Run {

    public static void main(String[] args) {

        try {

            ThreadB threadB = new ThreadB();

            ThreadA threadA = new ThreadA(threadB);


            threadA.start();

            threadB.start();

            threadB.join(2000);

            System.out.println("main end " + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
