package com.geektech.homeworkapplicationfragmentsviewpager.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

import com.geektech.homeworkapplicationfragmentsviewpager.R;

public class ThirdFragment extends Fragment implements CompoundButton.OnCheckedChangeListener {

    private ImageView imageView;
    private Switch aSwitch;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViews(view);

        if (aSwitch !=null){
            aSwitch.setOnCheckedChangeListener(this);
        }

    }

    private void initViews(View view) {
        imageView = view.findViewById(R.id.iv_mage);
        aSwitch = view.findViewById(R.id.btnSwitch);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if (isChecked){
        imageView.setImageResource(R.drawable.magee);
        }

        else{
            imageView.setImageResource(R.drawable.mage);
        }
    }

    }
