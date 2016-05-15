package com.samifattah.brooks21.gui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.samifattah.brooks21.R;
import com.samifattah.brooks21.util.Utility;

public class StartLogoScreenFragment extends BaseFragment
{
    private Button m_LoginButton   = null;

    private Button m_LoginRegister = null;

    public StartLogoScreenFragment()
    {
        Utility.logDebug(m_szTag,"StartLogoScreenFragment");

        m_szTag = new String("StartLogoScreenFragment");

        m_iLayoutID = R.layout.fragment_startlogoscreen;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        Utility.logDebug(m_szTag,"onCreateView");

        super.onCreateView(inflater, container, savedInstanceState);

        return m_View;
    }

    @Override
    public void handleClick(View v)
    {
        Utility.logDebug(m_szTag,"handleClick");

        if(v.getId()==)
        {

        }
    }
}
