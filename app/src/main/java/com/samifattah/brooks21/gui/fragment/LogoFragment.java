package com.samifattah.brooks21.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.samifattah.brooks21.R;
import com.samifattah.brooks21.util.BaseFragment;
import com.samifattah.brooks21.util.Utility;

public class LogoFragment extends BaseFragment
{

    public interface LogoFragmentInterface extends BaseFragmentInterface
    {

    }

    public LogoFragment()
    {
        Utility.logDebug(m_szTag,"LogoFragment");

        m_szTag = new String("LogoFragment");

        m_iLayoutID = R.layout.fragment_logo;

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
