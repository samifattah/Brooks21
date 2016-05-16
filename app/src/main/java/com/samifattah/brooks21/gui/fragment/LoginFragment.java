package com.samifattah.brooks21.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.samifattah.brooks21.R;
import com.samifattah.brooks21.util.BaseFragment;
import com.samifattah.brooks21.util.Utility;

public class LoginFragment extends BaseFragment
{
    private Button   m_LoginButton              = null;
    private Button   m_LoginWithFaceBook        = null;
    private Button   m_LoginWithGooglePlus      = null;
    private EditText m_DummyText                = null;
    private EditText m_UserNameAndEmailEditText = null;
    private EditText m_PasswordEditText         = null;


    public interface StartLogoScreenFragmentInterface extends BaseFragmentInterface
    {
        void whatthefuck();
    }

    public LoginFragment()
    {
        Utility.logDebug(m_szTag,"LoginFragment");

        m_szTag = new String("LoginFragment");

        m_iLayoutID = R.layout.fragment_login_register;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        Utility.logDebug(m_szTag,"onCreateView");

        super.onCreateView(inflater, container, savedInstanceState);

        m_LoginButton                 = (Button) m_View.findViewById(R.id.button1id);
        m_LoginWithFaceBook           = (Button) m_View.findViewById(R.id.button2id);
        m_LoginWithGooglePlus         = (Button) m_View.findViewById(R.id.button3id);
        m_DummyText                   = (EditText) m_View.findViewById(R.id.edittext1id);
        m_UserNameAndEmailEditText    = (EditText) m_View.findViewById(R.id.edittext2id);
        m_PasswordEditText            = (EditText) m_View.findViewById(R.id.edittext3id);

        Utility.Assert(m_LoginButton!=null);
        Utility.Assert(m_LoginWithFaceBook!=null);
        Utility.Assert(m_LoginWithGooglePlus!=null);
        Utility.Assert(m_DummyText!=null);
        Utility.Assert(m_UserNameAndEmailEditText!=null);
        Utility.Assert(m_PasswordEditText!=null);

        if(m_LoginButton!=null)
        {
            m_LoginButton.setText("LOGIN");

            m_LoginButton.setOnClickListener(this);
        }

        if(m_LoginWithFaceBook!=null)
        {
            m_LoginWithFaceBook.setText("LOGIN WITH FACEBOOK");

            m_LoginWithFaceBook.setOnClickListener(this);
        }

        if(m_LoginWithGooglePlus!=null)
        {
            m_LoginWithGooglePlus.setText("LOGIN WITH GOOGLE+");

            m_LoginWithGooglePlus.setOnClickListener(this);
        }

        if(m_DummyText!=null)
        {
            m_DummyText.setText("");

            m_DummyText.setVisibility(View.GONE);

            m_DummyText.setOnClickListener(this);
        }

        if(m_UserNameAndEmailEditText!=null)
        {
            m_UserNameAndEmailEditText.setText("");

            m_UserNameAndEmailEditText.setHint("Username or password");

            m_UserNameAndEmailEditText.setOnClickListener(this);
        }

        if(m_PasswordEditText!=null)
        {
            m_PasswordEditText.setText("");

            m_PasswordEditText.setHint("Password");

            m_PasswordEditText.setOnClickListener(this);
        }

        return m_View;
    }

    @Override
    public void handleClick(View v)
    {

        Utility.logDebug(m_szTag,"handleClick");

        if(v.getId()==m_LoginButton.getId())
        {

        }

        if(v.getId()==m_LoginWithFaceBook.getId())
        {

        }

        if(v.getId()==m_LoginWithGooglePlus.getId())
        {

        }

        if(v.getId()==m_DummyText.getId())
        {

        }

        if(v.getId()==m_UserNameAndEmailEditText.getId())
        {

        }

        if(v.getId()==m_PasswordEditText.getId())
        {

        }

    }
}
