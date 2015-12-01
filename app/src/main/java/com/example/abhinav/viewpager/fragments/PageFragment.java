package com.example.abhinav.viewpager.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abhinav.viewpager.R;
import com.example.abhinav.viewpager.models.Message;

/**
 * Created by abhinav on 30/11/15.
 */
public class PageFragment extends Fragment {

    public static PageFragment newInstance(Message message) {
        Bundle bundle = new Bundle();
        bundle.putInt("MSG_TYPE", message.getMessageType());
        bundle.putParcelable("MSG", message);

        PageFragment fragment = new PageFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        int messageType = getArguments().getInt("MSG_TYPE");
        Message message = getArguments().getParcelable("MSG");
        ViewGroup rootView = null;
        Log.v("PageFragment:msg_type--", "" + messageType);
        switch (messageType) {
            case 0:
                rootView = (ViewGroup) inflater.inflate(R.layout.content_type_a_layout, container, false);
                TextView tv = (TextView) rootView.findViewById(R.id.text1);
                tv.setText(message.getData().get(0));
                break;
            case 1:
                rootView = (ViewGroup) inflater.inflate(R.layout.content_type_b_layout, container, false);
                TextView tv1 = (TextView) rootView.findViewById(R.id.text1);
                tv1.setText(message.getData().get(0));
                TextView tv2 = (TextView) rootView.findViewById(R.id.text2);
                tv2.setText(message.getData().get(1));
                break;
        }
        return rootView;
    }
}
