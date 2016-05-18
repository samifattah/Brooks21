package com.samifattah.brooks21.util;

import java.util.ArrayList;

/**
 * Created by osamaabdelfattah on 5/17/16.
 */
public class FragmentManager
{
    private final String s_szTag = "FragmentManager";

    ArrayList<BaseFragment> m_FragmentsList = null;

    public FragmentManager()
    {
        Utility.logDebug(s_szTag,"FragmentManager");

        m_FragmentsList = new ArrayList<BaseFragment>();

        Utility.Assert(m_FragmentsList!=null);
    }

    void addFragment( BaseFragment  baseFragment )
    {
        Utility.logDebug(s_szTag,"addFragment");

        Utility.Assert(m_FragmentsList!=null);

        if(m_FragmentsList!=null)
        {
            m_FragmentsList.add(baseFragment);
        }
    }

    void removeFragment( BaseFragment  baseFragment )
    {

        Utility.logDebug(s_szTag,"removeFragment");

        Utility.Assert(m_FragmentsList!=null);

        if(m_FragmentsList!=null)
        {
            m_FragmentsList.remove(baseFragment);
        }
    }

    BaseFragment getFragment(int iIndex)
    {
        Utility.logDebug(s_szTag,"getFragment");

        Utility.Assert(m_FragmentsList!=null);

        BaseFragment baseFragment = null;

        if(m_FragmentsList!=null)
        {

            baseFragment = m_FragmentsList.get(iIndex);

            Utility.Assert(baseFragment!=null);

        }

        return baseFragment;
    }

    BaseFragment getFragment( String szFragmentName )
    {
        Utility.logDebug(s_szTag,"getFragment");

        Utility.Assert(m_FragmentsList!=null);

        BaseFragment baseFragment = null;

        for( int iIndex = 0 ; iIndex < m_FragmentsList.size() ; iIndex++)
        {
            BaseFragment tempBaseFragment = m_FragmentsList.get(iIndex);

            if((tempBaseFragment!=null) && tempBaseFragment.equals(tempBaseFragment));
            {
                baseFragment = tempBaseFragment;

                break;
            }
        }

        return baseFragment;
    }

}
