package com.geektech.homeworkapplicationfragmentsviewpager.ui.fragments;

import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

import com.geektech.homeworkapplicationfragmentsviewpager.R;

public class SecondFragment extends Fragment {

    private TextView tvDateTime, tvBishkek;
    private ImageView imageView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViews(view);

        tvDateTime.setText(android.text.format.DateFormat.format("kk:mm dd-MM-yyyy", new java.util.Date()));
    }

    private void initViews(View view) {
        tvDateTime = view.findViewById(R.id.tv_date_time);
        tvBishkek = view.findViewById(R.id.tv_bishkek);
        imageView = view.findViewById(R.id.iv_rome);
    }
}