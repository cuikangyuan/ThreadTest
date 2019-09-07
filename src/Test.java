import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Test {


    static class MyThread extends Thread {


        public String name;

        public MyThread(String name) {

            this.name = name;

        }

        @Override
        public void run() {

            System.out.println("thread name : " + name + " >>> run ");

            try {

                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("thread name : " + name + " >>> finish");


        }
    }

    static class MyThread1 extends Thread {


        public String name;


        public MyThread1(String name) {

            this.name = name;


        }

        @Override
        public void run() {

            System.out.println("thread name : " + name + " >>> run ");

            try {

                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("thread name : " + name + " >>> finish");


        }
    }

    static class MyThread2 extends Thread {


        public String name;

        public MyThread1 myThread1;

        public MyThread2(String name, MyThread1 myThread1) {

            this.name = name;

            this.myThread1 = myThread1;

        }

        @Override
        public void run() {

            try {
                myThread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("thread name : " + name + " >>> run ");

            try {

                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("thread name : " + name + " >>> finish");


        }
    }

    static class MyThread3 extends Thread {


        public String name;

        public MyThread2 myThread2;

        public MyThread3(String name, MyThread2 myThread2) {

            this.name = name;

            this.myThread2 = myThread2;

        }

        @Override
        public void run() {

            try {
                myThread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("thread name : " + name + " >>> run ");

            try {

                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("thread name : " + name + " >>> finish");


        }
    }

    public static void main(String[] arsg) throws InterruptedException {


        System.out.println("thread name >>> " + Thread.currentThread().getName());


        LinkedList linkedList = new LinkedList();

        LinkedHashMap linkedHashMap = new LinkedHashMap();


//        ThreadA myThread1 = new ThreadA("1");
//
//
//        ThreadA myThread2 = new ThreadA("2");
//
//
//        ThreadA myThread3 = new ThreadA("3");
//
//
////        myThread1.start();
////        myThread2.start();
////        myThread3.start();
//
//        myThread1.start();
//
//        myThread2.start();
//
//        myThread1.join();
//        myThread2.join();
//
//        myThread3.start();

        //--------------------------------------------------------

//        MyThread1 myThread1 = new MyThread1("1");
//
//
//        MyThread2 myThread2 = new MyThread2("2", myThread1);
//
//
//        MyThread3 myThread3 = new MyThread3("3", myThread2);
//
//
//
//        myThread1.start();
//
//        myThread2.start();
//
//        myThread3.start();




        //--------------------------------------------------------


//        new Thread1("1").start();


        //--------------------------------------------------------


        //new Thread4().start();


    }



    static public class Thread1 extends Thread {


        public String name;

        public Thread1(String name) {

            this.name = name;

        }

        @Override
        public void run() {

            System.out.println("thread name : " + name + " >>> run ");

            try {

                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("thread name : " + name + " >>> finish");


            new Thread2("2").start();

        }
    }

    static public class Thread2 extends Thread {


        public String name;

        public Thread2(String name) {

            this.name = name;

        }

        @Override
        public void run() {

            System.out.println("thread name : " + name + " >>> run ");

            try {

                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("thread name : " + name + " >>> finish");

            new Thread3("3").start();


        }
    }

    static public class Thread3 extends Thread {


        public String name;

        public Thread3(String name) {

            this.name = name;

        }

        @Override
        public void run() {

            System.out.println("thread name : " + name + " >>> run ");

            try {

                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("thread name : " + name + " >>> finish");

        }
    }

    static public class Thread4 extends Thread {

        @Override
        public void run() {

            try {
                join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println( " >>> run ");

            try {

                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(" >>> finish");
        }
    }
}
