package com.geektech.homeworkapplicationfragmentsviewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Adapter;

import com.geektech.homeworkapplicationfragmentsviewpager.ui.ViewPagerAdapter;
import com.geektech.homeworkapplicationfragmentsviewpager.ui.fragments.FirstFragment;
import com.geektech.homeworkapplicationfragmentsviewpager.ui.fragments.SecondFragment;
import com.geektech.homeworkapplicationfragmentsviewpager.ui.fragments.ThirdFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private ArrayList<Fragment> list = new ArrayList<>();
    private ViewPagerAdapter adapter;
    private TabLayout tabLayout;
    private String[] listTL = {"Exchange", "Date & Time", "More"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        createLIst();
        initViewPager();

    }

    private void initViews() {
        viewPager2 = findViewById(R.id.vp_view_pager);
        tabLayout = findViewById(R.id.tl_tablayout);
    }

    private void createLIst() {
        list.add(new FirstFragment());
        list.add(new SecondFragment());
        list.add(new ThirdFragment());
    }

    private void initViewPager() {

        adapter = new ViewPagerAdapter(this);
        adapter.setList(list);
        viewPager2.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(listTL[position]);

            }
        }).attach();
    }



}