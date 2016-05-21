package com.samifattah.brooks21.gui.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.samifattah.brooks21.R;

import java.util.ArrayList;

public class MainAppActivity extends AppCompatActivity  {

    private ListView m_DrawerList = null;
    private DrawerLayout m_DrawerLayout;
    private ArrayAdapter<String> m_Adapter = null;
    private ActionBarDrawerToggle m_DrawerToggle = null;
    //private ArrayList<FragmentItem> m_FragmentItemsArrayList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_app);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        //m_DrawerList = (ListView) findViewById(R.id.list_slidermenu);

        m_DrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        m_DrawerToggle = new ActionBarDrawerToggle(this, m_DrawerLayout,toolbar,R.string.app_name,R.string.app_name);



//        m_DrawerList.setOnItemClickListener(this);
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        getSupportActionBar().setHomeButtonEnabled(true);
//
  //      m_DrawerToggle.setDrawerIndicatorEnabled(true);
//
        m_DrawerLayout.setDrawerListener( m_DrawerToggle );
//
//        String[] osArray = { "osama" , "abdelfattah" };
//
//        m_Adapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1,osArray);
//
//        m_DrawerList.setAdapter(m_Adapter);
//
        m_DrawerToggle.syncState();

    }

//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
//    {
//        //displayFragment(position);
//
//        m_DrawerLayout.closeDrawers();
//
//    }
//
//    @Override
//    protected void onPostCreate(Bundle savedInstanceState)
//    {
//        super.onPostCreate(savedInstanceState);
//
//        m_DrawerToggle.syncState();
//    }
//
//    @Override
//    public void onConfigurationChanged(Configuration configuration)
//    {
//        super.onConfigurationChanged(configuration);
//
//        m_DrawerToggle.onConfigurationChanged(configuration);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item)
//    {
//        if (m_DrawerToggle.onOptionsItemSelected(item))
//        {
//            return true;
//        }
//
//        switch (item.getItemId())
//        {
//            default:
//            {
//                return super.onOptionsItemSelected(item);
//            }
//        }
//    }

}
