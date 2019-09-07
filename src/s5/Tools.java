package s5;

import java.util.Date;

public class Tools {


    //存储每个线程的私有数据
    public static ThreadLocal<Date> tl = new ThreadLocal<Date> ();
}
