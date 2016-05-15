package com.samifattah.brooks21.gui.activity;

import android.os.Bundle;

import com.samifattah.brooks21.R;
import com.samifattah.brooks21.gui.fragment.StartLogoScreenFragment;
import com.samifattah.brooks21.util.BaseActivity;
import com.samifattah.brooks21.util.IntentHelper;
import com.samifattah.brooks21.util.Utility;

public class MainActivity extends BaseActivity implements StartLogoScreenFragment.StartLogoScreenFragmentInterface
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

    @Override
    public void whatthefuck()
    {
        IntentHelper intentHelper = new IntentHelper();

        intentHelper.navigateToOneWay("http://www.google.com");

    }
}
