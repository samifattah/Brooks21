package com.samifattah.brooks21.gui;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.samifattah.brooks21.R;

/**
 * Created by osamaabdelfattah on 5/14/16.
 */
public class BaseFragment extends Fragment
{
    protected Activity    m_Activity 		  		   = null;
    protected View        m_View					   = null;
    protected int 		  m_iLayoutID				   = 0;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(m_iLayoutID, container, false);
    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
    }


}
