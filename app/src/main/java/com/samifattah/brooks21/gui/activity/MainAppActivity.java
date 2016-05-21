package com.samifattah.brooks21.gui.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.samifattah.brooks21.R;

public class MainAppActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private ListView m_DrawerList = null;
    private DrawerLayout m_DrawerLayout = null;
    private ArrayAdapter<String> m_Adapter = null;
    private ActionBarDrawerToggle m_DrawerToggle = null;
    private Toolbar m_Toolbar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_app);

        m_Toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(m_Toolbar);

        m_DrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        m_DrawerToggle = new ActionBarDrawerToggle(this, m_DrawerLayout,m_Toolbar,R.string.app_name,R.string.app_name);

        m_DrawerLayout.setDrawerListener( m_DrawerToggle );

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);

        m_DrawerToggle.syncState();

    }

    @Override
    public void onBackPressed()
    {
        if (m_DrawerLayout.isDrawerOpen(GravityCompat.START))
        {
            m_DrawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {

        int id = item.getItemId();

        if (id == R.id.aboutus)
        {

        }
        else
        if (id == R.id.contactus)
        {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}
