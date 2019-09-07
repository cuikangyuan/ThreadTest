package InheritableThreadLocal1;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {

    //子线程继承父线程的值
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
