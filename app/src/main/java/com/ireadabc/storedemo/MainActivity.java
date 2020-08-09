package com.ireadabc.storedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.ireadabc.storedemo.store.fragment.StoreFragment;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFragment();
    }

    private void initFragment() {
        FragmentManager fm = this.getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment, new StoreFragment());

        // addToBackStack添加到回退栈,addToBackStack与ft.add(R.id.fragment, new
        // MyFragment())效果相当
        // ft.addToBackStack("test");

        ft.commit();

    }
}