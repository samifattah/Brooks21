package com.samifattah.brooks21.gui;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

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
    protected void onPause()
    {
        Utility.logDebug(m_LocalTag,"onPause");

        super.onPause();
    }

    @Override
    protected void onResume()
    {
        Utility.logDebug(m_LocalTag,"onResume");

        super.onResume();
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState)
    {
        Utility.logDebug(m_LocalTag,"onRestoreInstanceState");

        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onRestart()
    {
        Utility.logDebug(m_LocalTag,"onRestart");

        super.onRestart();
    }

    @Override
    public void onStart()
    {
        Utility.logDebug(m_LocalTag,"onStart");

        super.onStart();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        Utility.logDebug(m_LocalTag,"onSaveInstanceState");

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onStop()
    {
        Utility.logDebug(m_LocalTag,"onStop");

        super.onStop();
    }

    @Override
    public void onDestroy()
    {
        Utility.logDebug(m_LocalTag,"onDestroy");

        super.onDestroy();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        Utility.logDebug(m_LocalTag,"onTouchEvent");

        return super.onTouchEvent(event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        Utility.logDebug(m_LocalTag,"onCreateOptionsMenu");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Utility.logDebug(m_LocalTag,"onOptionsItemSelected");

        return super.onOptionsItemSelected(item);
    }
}
