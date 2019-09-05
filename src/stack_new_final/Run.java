package stack_new_final;


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

        ThreadC threadC = new ThreadC(c);
        threadC.setName("1");
        threadC.start();




    }
}
