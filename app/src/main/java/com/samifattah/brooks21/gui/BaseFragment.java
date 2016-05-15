package com.samifattah.brooks21.gui;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.samifattah.brooks21.util.Utility;

/**
 * Created by osamaabdelfattah on 5/14/16.
 */
public abstract class BaseFragment extends Fragment implements View.OnClickListener
{
    private final String  m_LocalTag                   = "BaseFragment";
    protected String      m_szTag                      = null;
    protected Activity    m_Activity 		  		   = null;
    protected View        m_View					   = null;
    protected int 		  m_iLayoutID				   = 0;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        Utility.logDebug(m_LocalTag,"onCreate");

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState)
    {
        Utility.logDebug(m_LocalTag,"onCreateView");

        m_View = inflater.inflate( m_iLayoutID , container , false );

        Utility.Assert( m_View != null );

        return m_View;
    }

    @Override
    public void onAttach(Context context)
    {
        Utility.logDebug(m_LocalTag,"onAttach");

        super.onAttach(context);

        m_Activity = (Activity) context;

        Utility.Assert( m_Activity != null );

//        try
//        {
//            m_OnQFragmentInterface = ( OnQFragmentInterface )activity;
//        }
//        catch (ClassCastException e)
//        {
//            Utility.Assert();
//        }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        Utility.logDebug(m_LocalTag,"onActivityCreated");

        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart()
    {
        Utility.logDebug(m_LocalTag,"onStart");

        super.onStart();
    }

    @Override
    public void onResume()
    {
        Utility.logDebug(m_LocalTag,"onResume");

        super.onResume();
    }

    @Override
    public void onPause()
    {
        Utility.logDebug(m_LocalTag,"onPause");

        super.onPause();
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
    public void onDestroyView()
    {
        Utility.logDebug(m_LocalTag,"onDestroyView");

        super.onDestroyView();
    }

    @Override
    public void onDestroy()
    {
        Utility.logDebug(m_LocalTag,"onDestroy");

        super.onDestroy();
    }

    @Override
    public void onDetach()
    {
        Utility.logDebug(m_LocalTag,"onDetach");

        super.onDetach();
    }

    @Override
    public void onClick(View v)
    {
        Utility.logDebug(m_LocalTag,"onClick");
    }

    public abstract void handleClick(View v);
}
