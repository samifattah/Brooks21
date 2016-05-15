package com.samifattah.brooks21.gui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.samifattah.brooks21.R;
import com.samifattah.brooks21.util.Utility;

public class MainActivity extends BaseActivity
{

    public MainActivity()
    {
        Utility.logDebug(m_szTag,"MainActivity");

        m_szTag = new String("MainActivity");

        m_iLayoutID = R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Utility.logDebug(m_szTag,"onCreate");

        super.onCreate(savedInstanceState);



//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.activity_main);
    }

}
