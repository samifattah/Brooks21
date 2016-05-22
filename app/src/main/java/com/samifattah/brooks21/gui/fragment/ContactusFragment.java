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

public class ContactusFragment extends BaseFragment
{
    private Button   m_LoginButton              = null;
    private Button   m_LoginWithFaceBook        = null;
    private Button   m_LoginWithGooglePlus      = null;
    private EditText m_DummyText                = null;
    private EditText m_UserNameAndEmailEditText = null;
    private EditText m_PasswordEditText         = null;


    public interface ContactUsFragmentInterface extends BaseFragmentInterface
    {
    }

    public ContactusFragment()
    {
        Utility.logDebug(m_szTag,"LoginFragment");

        m_szTag = new String("ContactusFragment");

        m_iLayoutID = R.layout.fragment_contactus;

        m_szFragmentName = new String(m_szTag);
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

    }
}
