package com.example.valerieatuti.takemetochurch;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;

/**
 * Created by valerieatuti on 8/5/16.
 */
public class Home extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle(R.string.app_name);


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.menu);

        mDrawerLayout.openDrawer(Gravity.LEFT);

        mFragmentManager = getSupportFragmentManager();

        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView, new LaunchFragment()
        ).commit();



        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                                                              @Override
                                                              public boolean onNavigationItemSelected(MenuItem menuItem) {
                                                                  mDrawerLayout.closeDrawers();


                                                                  if (menuItem.getItemId() == R.id.churchevents) {

                                                                      FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                                                                      xfragmentTransaction.replace(R.id.containerView, new ChurchEventsFragment()).commit();

                                                                  }
                                                                  if (menuItem.getItemId() == R.id.dailybread) {

                                                                      FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                                                                      xfragmentTransaction.replace(R.id.containerView, new DailyBreadFragment()).commit();

                                                                      toolbar.setTitle("Eat");
                                                                  }
                                                                  if (menuItem.getItemId() == R.id.biblestudy) {

                                                                      FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                                                                      xfragmentTransaction.replace(R.id.containerView, new BibleStudyFragment()).commit();
                                                                      toolbar.setTitle("Service");
                                                                  }

                                                                  if (menuItem.getItemId() == R.id.testimonies) {

                                                                      FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                                                                      xfragmentTransaction.replace(R.id.containerView, new TestimoniesFragment()).commit();
                                                                      toolbar.setTitle("Book");
                                                                  }
                                                                  if (menuItem.getItemId() == R.id.socialnetwork) {

                                                                      FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                                                                      xfragmentTransaction.replace(R.id.containerView, new LaunchFragment()).commit();
                                                                      toolbar.setTitle("Location");
                                                                  }
                                                                  if (menuItem.getItemId() == R.id.myevents) {

                                                                      FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                                                                      xfragmentTransaction.replace(R.id.containerView, new MyEventsFragment()).commit();

                                                                      toolbar.setTitle("Register");
                                                                  }
                                                                  if (menuItem.getItemId() == R.id.nchurch) {


                                                                      FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                                                                      xfragmentTransaction.replace(R.id.containerView, new NearestChurchFragment()).commit();

                                                                      toolbar.setTitle("Amenities");
                                                                  }
                                                                  if (menuItem.getItemId() == R.id.about_us) {


                                                                      FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                                                                      xfragmentTransaction.replace(R.id.containerView, new AboutUsFragment()).commit();

                                                                      toolbar.setTitle("About us");
                                                                  }


                                                                  if (menuItem.getItemId() == R.id.fchurch) {
                                                                      FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                                                                      xfragmentTransaction.replace(R.id.containerView, new FeaturedChurchFragment()).commit();

                                                                      toolbar.setTitle("Contact Us");
                                                                  }
                                                                  if (menuItem.getItemId() == R.id.share) {
                                                                      FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                                                                      xfragmentTransaction.replace(R.id.containerView, new ShareFragment()).commit();

                                                                      toolbar.setTitle("Share");
                                                                  }


                                                                  return false;
                                                              }

                                                          }

        );

        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.app_name,
                R.string.app_name);


        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();

    }
}