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

public class RegisterFragment extends BaseFragment
{
    private Button   m_RegisterButton = null;
    private Button   m_RegisterWithFaceBook        = null;
    private Button   m_RegisterWithGooglePlus      = null;
    private EditText m_EmailEditText               = null;
    private EditText m_UserNameEditText            = null;
    private EditText m_PasswordEditText            = null;


    public interface StartLogoScreenFragmentInterface extends BaseFragmentInterface
    {
        void whatthefuck();
    }

    public RegisterFragment()
    {
        Utility.logDebug(m_szTag,"RegisterFragment");

        m_szTag = new String("RegisterFragment");

        m_iLayoutID = R.layout.fragment_login_register;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        Utility.logDebug(m_szTag,"onCreateView");

        super.onCreateView(inflater, container, savedInstanceState);

        m_RegisterButton            = (Button) m_View.findViewById(R.id.button1id);
        m_RegisterWithFaceBook      = (Button) m_View.findViewById(R.id.button2id);
        m_RegisterWithGooglePlus    = (Button) m_View.findViewById(R.id.button3id);
        m_EmailEditText             = (EditText) m_View.findViewById(R.id.edittext1id);
        m_UserNameEditText          = (EditText) m_View.findViewById(R.id.edittext2id);
        m_PasswordEditText          = (EditText) m_View.findViewById(R.id.edittext3id);

        Utility.Assert(m_RegisterButton !=null);
        Utility.Assert(m_RegisterWithFaceBook!=null);
        Utility.Assert(m_RegisterWithGooglePlus!=null);
        Utility.Assert(m_EmailEditText!=null);
        Utility.Assert(m_UserNameEditText!=null);
        Utility.Assert(m_PasswordEditText!=null);

        if(m_RegisterButton !=null)
        {
            m_RegisterButton.setText("REGISTER");

            m_RegisterButton.setOnClickListener(this);
        }

        if(m_RegisterWithFaceBook!=null)
        {
            m_RegisterWithFaceBook.setText("REGISTER WITH FACEBOOK");

            m_RegisterWithFaceBook.setOnClickListener(this);
        }

        if(m_RegisterWithGooglePlus!=null)
        {
            m_RegisterWithGooglePlus.setText("REGISTER WITH GOOGLE+");

            m_RegisterWithGooglePlus.setOnClickListener(this);
        }

        if(m_EmailEditText!=null)
        {
            m_EmailEditText.setText("");

            m_EmailEditText.setHint("Email");

            m_EmailEditText.setOnClickListener(this);
        }

        if(m_UserNameEditText!=null)
        {
            m_UserNameEditText.setText("");

            m_UserNameEditText.setHint("Username");

            m_UserNameEditText.setOnClickListener(this);
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

        if(v.getId()== m_RegisterButton.getId())
        {

        }

        if(v.getId()==m_RegisterWithFaceBook.getId())
        {

        }

        if(v.getId()==m_RegisterWithGooglePlus.getId())
        {

        }

        if(v.getId()==m_EmailEditText.getId())
        {

        }

        if(v.getId()==m_UserNameEditText.getId())
        {

        }

        if(v.getId()==m_PasswordEditText.getId())
        {

        }

    }
}
