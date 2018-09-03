package com.example.lenovo.pets;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    BottomNavigationView bottomNavigationView;
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        tabLayout.addTab(tabLayout.newTab().setText("DOGS"));
        tabLayout.addTab(tabLayout.newTab().setText("CATS"));
        tabLayout.addTab(tabLayout.newTab().setText("BIRDS"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);
        Pager pager = new Pager(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pager);
        tabLayout.setOnTabSelectedListener(this);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                tabLayout.setScrollIndicators(i);
            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:home();break;
                    case R.id.share:share();break;
                    case R.id.info:info();break;
                }
                return true;
            }
        });
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tabLayout.getSelectedTabPosition());
        tabLayout.setSelectedTabIndicator(tabLayout.getTabSelectedIndicator());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    public void share(){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String shareS = "Your Subject here";
        String shareB = "Your Body here";
        intent.putExtra(intent.EXTRA_SUBJECT,shareS);
        intent.putExtra(intent.EXTRA_TEXT,shareB);
        startActivity(intent.createChooser(intent,"Share via"));
    }

    public void home(){
        Toast.makeText(getApplicationContext(),"HOME ACTIVITY",Toast.LENGTH_SHORT).show();
    }

    public void info(){
        Toast.makeText(getApplicationContext(),"INFO",Toast.LENGTH_SHORT).show();
        Intent ia = new Intent(MainActivity.this,Info.class);
        startActivity(ia);
    }
}
