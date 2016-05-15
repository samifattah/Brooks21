package com.samifattah.brooks21.gui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.samifattah.brooks21.R;

public class BaseActivity extends AppCompatActivity implements BaseFragment.BaseFragmentInterface
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    @Override
    public void onDoSomething(int index)
    {

    }
}
