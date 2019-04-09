package com.twomonth.mylib_core.delegates;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.yokeyword.fragmentation_swipeback.SwipeBackFragment;

public abstract class BaseDelegate extends SwipeBackFragment {

    public abstract Object setLayout();
    public abstract void onBandView(@Nullable Bundle savedInstanceState,View rootView);

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootViwe = null;
        if (setLayout() instanceof Integer){
            rootViwe = inflater.inflate((Integer) setLayout(),container,false);
        }else if (setLayout() instanceof View){
            rootViwe = (View) setLayout();
        }
        if (rootViwe != null){
            onBandView(savedInstanceState,rootViwe);
        }
        return rootViwe;
    }
}
