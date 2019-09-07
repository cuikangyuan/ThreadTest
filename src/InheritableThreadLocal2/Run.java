package InheritableThreadLocal2;




//值继承 再修改
public class Run {

    public static void main(String[] args) {

        try {


            for (int i = 0; i < 10; i++) {

                System.out.println("Main线程中取值 " + Tools.tl.get());

                Thread.sleep(100);
            }


            Thread.sleep(5000);

            //此处更新  子线程取到的是主线程修改后的新值
//            System.out.println("Main线程中修改值 ");
//            Tools.tl.set(Tools.tl.get() + "Main线程中修改值");


            ThreadA a = new ThreadA();

            a.start();

            //此处更新  子线程取到的是旧值
//            System.out.println("Main线程中修改值 ");
//            Tools.tl.set(Tools.tl.get() + "Main线程中修改值");





        } catch (InterruptedException e) {

            e.printStackTrace();

        }
    }
}
