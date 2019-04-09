package com.twomonth.suppermarket;



import com.twomonth.mylib_core.activitys.ProxyActivity;
import com.twomonth.mylib_core.delegates.LatteDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
