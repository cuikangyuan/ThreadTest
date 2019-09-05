package stack_4;


public class Run {


    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);



        ThreadP threadP1 = new ThreadP(p1);
        threadP1.setName("1");
        ThreadP threadP2 = new ThreadP(p2);
        threadP2.setName("2");
        ThreadP threadP3 = new ThreadP(p3);
        threadP3.setName("3");
        ThreadP threadP4 = new ThreadP(p4);
        threadP4.setName("4");
        ThreadP threadP5 = new ThreadP(p5);
        threadP5.setName("5");


        threadP1.start();
        threadP2.start();
        threadP3.start();
        threadP4.start();
        threadP5.start();


        C c = new C(myStack);

        ThreadC threadC1 = new ThreadC(c);
        threadC1.setName("1");
        ThreadC threadC2 = new ThreadC(c);
        threadC2.setName("2");
        ThreadC threadC3 = new ThreadC(c);
        threadC3.setName("3");
        ThreadC threadC4 = new ThreadC(c);
        threadC4.setName("4");
        ThreadC threadC5 = new ThreadC(c);
        threadC5.setName("5");

        threadC1.start();
        threadC2.start();
        threadC3.start();
        threadC4.start();
        threadC5.start();




    }
}
