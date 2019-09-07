package ThreadLocal22;

public class Run {

    public static ThreadLocalExt threadLocalExt = new ThreadLocalExt();

    public static void main(String[] args) {

        if (threadLocalExt.get() == null) {

            System.out.println("从未放过值");
            threadLocalExt.set("我的值");

        }

        System.out.println(threadLocalExt.get());
        System.out.println(threadLocalExt.get());

    }
}
