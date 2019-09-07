package MustUseMoreCondition;


public class Run {

    public static void main(String[] args) throws InterruptedException {

        MyService myService = new MyService();
        ThreadA a1 = new ThreadA(myService);
        ThreadA a2 = new ThreadA(myService);
        ThreadA a3 = new ThreadA(myService);

        a1.start();
        a2.start();
        a3.start();

        Thread.sleep(3000);

        myService.signalAll_A();

    }
}
