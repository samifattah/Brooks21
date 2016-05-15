package com.samifattah.brooks21.gui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.samifattah.brooks21.R;
import com.samifattah.brooks21.util.BaseFragment;
import com.samifattah.brooks21.util.Utility;

public class StartLogoScreenFragment extends BaseFragment
{
    private Button m_LoginButton   = null;

    private Button m_LoginRegister = null;


    public interface StartLogoScreenFragmentInterface extends BaseFragmentInterface
    {
        void whatthefuck();
    }

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

        m_LoginButton   = (Button) m_View.findViewById(R.id.loginbutton);

        m_LoginRegister = (Button) m_View.findViewById(R.id.registerbutton);

        Utility.Assert(m_LoginButton!=null);

        Utility.Assert(m_LoginRegister!=null);

        if(m_LoginButton!=null)
        {
            m_LoginButton.setOnClickListener(this);
        }


        if(m_LoginRegister!=null)
        {
            m_LoginRegister.setOnClickListener(this);
        }

        return m_View;
    }

    @Override
    public void handleClick(View v)
    {

        Utility.logDebug(m_szTag,"handleClick");

        if(v.getId()==this.m_LoginButton.getId())
        {
            StartLogoScreenFragmentInterface startLogoScreenFragmentInterface = (StartLogoScreenFragmentInterface) m_BaseFragmentInterface;

            startLogoScreenFragmentInterface.whatthefuck();
        }

        if(v.getId()==this.m_LoginRegister.getId())
        {

        }

    }
}
