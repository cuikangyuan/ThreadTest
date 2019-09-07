package join_sleep_2;

public class Run {

    public static void main(String[] args) {

        try {

            ThreadB threadB = new ThreadB();

            ThreadA threadA = new ThreadA(threadB);


            threadA.start();

            Thread.sleep(1000);

            ThreadC threadC = new ThreadC(threadB);

            threadC.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
