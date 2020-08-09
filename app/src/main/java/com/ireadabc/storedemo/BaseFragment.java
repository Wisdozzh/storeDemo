package com.ireadabc.storedemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sunny on 2019/1/6.
 */

public abstract class BaseFragment extends Fragment {

    public BaseFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return setCreateView(inflater,container,savedInstanceState);
    }

    public abstract View setCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) ;


    private void initView() {
        initData();
    }


    private void initData() {
    }




    private void reSet() {
    }

}
