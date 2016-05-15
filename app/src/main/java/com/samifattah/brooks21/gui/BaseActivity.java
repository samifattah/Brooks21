package com.samifattah.brooks21.gui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.samifattah.brooks21.R;
import com.samifattah.brooks21.util.Utility;

public class BaseActivity extends AppCompatActivity implements BaseFragment.BaseFragmentInterface
{
    private final String  m_LocalTag                   = "BaseActivity";
    protected String      m_szTag                      = null;
    protected int 		  m_iLayoutID				   = 0;

    public BaseActivity()
    {
        Utility.logDebug(m_szTag,"BaseActivity");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Utility.logDebug(m_LocalTag,"onCreate");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    @Override
    public void onDoSomething(int index)
    {

    }
}
