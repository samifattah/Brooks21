package com.samifattah.brooks21.gui.activity;

import android.os.Bundle;

import com.samifattah.brooks21.R;
import com.samifattah.brooks21.gui.fragment.LoginFragment;
import com.samifattah.brooks21.gui.fragment.RegisterFragment;
import com.samifattah.brooks21.gui.fragment.StartLogoScreenFragment;
import com.samifattah.brooks21.util.BaseActivity;
import com.samifattah.brooks21.util.FragmentManager;
import com.samifattah.brooks21.util.IntentHelper;
import com.samifattah.brooks21.util.Utility;

public class MainActivity extends BaseActivity implements StartLogoScreenFragment.StartLogoScreenFragmentInterface ,
                                                          LoginFragment.LoginFragmentInterface,
                                                          RegisterFragment.RegisterFragmentInterface
{

    private FragmentManager m_FragmentManager = null;

    public MainActivity()
    {
        int iIndex = 0;

        Utility.logDebug(m_szTag,"MainActivity");

        m_szTag = new String("MainActivity");

        m_iLayoutID = R.layout.activity_main;

        m_FragmentManager = new FragmentManager();

        Utility.Assert(m_FragmentManager!=null);

        {
            LoginFragment loginFragment = new LoginFragment();

            Utility.Assert(loginFragment != null);

            if (loginFragment != null)
            {
                loginFragment.setFragmentIndex(iIndex);

                iIndex++;
            }
        }

        {
            RegisterFragment registerFragment = new RegisterFragment();

            Utility.Assert(registerFragment != null);

            if (registerFragment != null)
            {
                registerFragment.setFragmentIndex(iIndex);

                iIndex++;
            }
        }

        {
            StartLogoScreenFragment startLogoScreenFragment = new StartLogoScreenFragment();

            Utility.Assert(startLogoScreenFragment != null);

            if (startLogoScreenFragment != null)
            {
                startLogoScreenFragment.setFragmentIndex(iIndex);

                iIndex++;
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Utility.logDebug(m_szTag,"onCreate");

        super.onCreate(savedInstanceState);

    }


    @Override
    public void login()
    {
        Utility.logDebug(m_szTag,"login");
    }

    @Override
    public void register()
    {
        Utility.logDebug(m_szTag,"register");

    }

    @Override
    public void login(String szUserName, String szPassword)
    {
        Utility.logDebug(m_szTag,"login");

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
