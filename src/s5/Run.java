package s5;

public class Run {



    public static void main(String[] args) throws InterruptedException {



        ThreadA threadA = new ThreadA();

        threadA.start();

        Thread.sleep(1000);

        ThreadB threadB = new ThreadB();
        threadB.start();


    }
}
