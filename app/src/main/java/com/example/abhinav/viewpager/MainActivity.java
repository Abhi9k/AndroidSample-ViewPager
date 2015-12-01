package com.example.abhinav.viewpager;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.example.abhinav.viewpager.adapters.FragmentPagerAdapter;
import com.example.abhinav.viewpager.models.Message;

import java.util.ArrayList;

/**
 * Created by abhinav on 30/11/15.
 */
public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        ArrayList<Message> messages = new ArrayList<Message>();
        ArrayList<String> data = new ArrayList<String>();
        data.add("This is line 1");
        messages.add(new Message(0, data));
        data.add("This is line 2");
        messages.add(new Message(1, data));


        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        FragmentPagerAdapter pagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager(), messages);

        pager.setAdapter(pagerAdapter);
    }
}
