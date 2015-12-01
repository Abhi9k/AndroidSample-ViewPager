package com.example.abhinav.viewpager.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.abhinav.viewpager.fragments.PageFragment;
import com.example.abhinav.viewpager.models.Message;

import java.util.ArrayList;

/**
 * Created by abhinav on 30/11/15.
 */
public class FragmentPagerAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Message> data;

    public FragmentPagerAdapter(FragmentManager fm, ArrayList<Message> data) {
        super(fm);
        this.data = data;
    }

    @Override
    public Fragment getItem(int position) {
        if (position < data.size() && position >= 0) {
            return PageFragment.newInstance(data.get(position));
        }
        return PageFragment.newInstance(data.get(0));
    }

    @Override
    public int getCount() {
        return data.size();
    }
}
