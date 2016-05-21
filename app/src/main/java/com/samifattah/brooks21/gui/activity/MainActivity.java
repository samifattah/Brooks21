package com.samifattah.brooks21.gui.activity;

import android.content.Intent;
import android.os.Bundle;

import com.samifattah.brooks21.R;
import com.samifattah.brooks21.gui.fragment.LoginFragment;
import com.samifattah.brooks21.gui.fragment.RegisterFragment;
import com.samifattah.brooks21.gui.fragment.StartLogoScreenFragment;
import com.samifattah.brooks21.util.BaseActivity;
import com.samifattah.brooks21.util.BaseFragment;
import com.samifattah.brooks21.util.FragmentsManager;
import com.samifattah.brooks21.util.IntentHelper;
import com.samifattah.brooks21.util.Utility;

public class MainActivity extends BaseActivity implements StartLogoScreenFragment.StartLogoScreenFragmentInterface ,
                                                          LoginFragment.LoginFragmentInterface,
                                                          RegisterFragment.RegisterFragmentInterface
{

    private FragmentsManager m_FragmenstManager = null;

    public MainActivity()
    {
        int iIndex = 0;

        Utility.logDebug(m_szTag,"MainActivity");

        m_szTag = new String("MainActivity");

        m_iLayoutID = R.layout.activity_main;

        m_FragmenstManager = new FragmentsManager(this,R.id.id2);

        Utility.Assert(m_FragmenstManager!=null);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Utility.logDebug(m_szTag,"onCreate");

        super.onCreate(savedInstanceState);

        BaseFragment startLogoScreenFragment = new StartLogoScreenFragment();

        this.m_FragmenstManager.addFragment(startLogoScreenFragment,true);

    }

    @Override
    public int backKeyPressed()
    {
        int iReturn = 1;

        if (getFragmentManager().getBackStackEntryCount() > 0 )
        {
            getFragmentManager().popBackStack();

            iReturn = 0;
        }

        return iReturn;
    }

    @Override
    public void loginMain()
    {
        Utility.logDebug(m_szTag,"login");

        BaseFragment baseFragment = new LoginFragment();

        this.m_FragmenstManager.replaceFragment(baseFragment,true);

    }

    @Override
    public void registerMain()
    {
        Utility.logDebug(m_szTag,"register");

        BaseFragment baseFragment = new RegisterFragment();

        this.m_FragmenstManager.replaceFragment(baseFragment,true);

    }

    @Override
    public void login(String szUserName, String szPassword)
    {
        Utility.logDebug(m_szTag,"login");

        //IntentHelper intentHelper = new IntentHelper(this);

        Intent intent = new Intent(this, MainAppActivity.class);

        startActivity(intent);

        this.finish();

    }

    @Override
    public void loginWithFaceBook(String szUserName, String szPassword)
    {
        Utility.logDebug(m_szTag,"loginWithFaceBook");



    }

    @Override
    public void loginWithGooglePlus(String szUserName, String szPassword)
    {
        Utility.logDebug(m_szTag,"loginWithGooglePlus");

    }

    @Override
    public void register(String szEmail ,String szUserName, String szPassword)
    {
        Utility.logDebug(m_szTag,"register");

    }

    @Override
    public void registernWithFaceBook(String szEmail , String szUserName, String szPassword)
    {
        Utility.logDebug(m_szTag,"registernWithFaceBook");

    }

    @Override
    public void registerWithGooglePlus(String SzEmail , String szUserName, String szPassword)
    {
        Utility.logDebug(m_szTag,"registerWithGooglePlus");

    }
}
