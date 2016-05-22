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

public class AboutusFragment extends BaseFragment
{

    public interface AboutUsFragmentInterface extends BaseFragmentInterface
    {
    }

    public AboutusFragment()
    {
        Utility.logDebug(m_szTag,"AboutusFragment");

        m_szTag = new String("AboutusFragment");

        m_iLayoutID = R.layout.fragment_aboutus;

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

        Utility.logDebug(m_szTag,"handleClick");

    }
}
