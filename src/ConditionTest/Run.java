package ConditionTest;


public class Run {

    public static void main(String[] args) throws InterruptedException {

        MyService myService = new MyService();


        ThreadA threadA = new ThreadA(myService);

        threadA.start();

        ThreadB threadB = new ThreadB(myService);

        threadB.start();

    }
}
