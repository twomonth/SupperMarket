package com.twomonth.suppermarket;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.twomonth.mylib_core.delegates.LatteDelegate;
import com.twomonth.mylib_core.net.RestClient;
import com.twomonth.mylib_core.net.callback.ISuccess;
import com.twomonth.mylib_core.ui.LoaderStyle;

public class ExampleDelegate extends LatteDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBandView(@Nullable Bundle savedInstanceState, View rootView) {
        testRestClient();
    }

    private void testRestClient(){
        RestClient.builder()
                .url("http://www.baidu.com")
                .succes(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                        Log.e("tm:::",response);
                    }
                })
                .loader(getContext(),LoaderStyle.BallPulseSyncIndicator)
                .build().get();
    }
}
