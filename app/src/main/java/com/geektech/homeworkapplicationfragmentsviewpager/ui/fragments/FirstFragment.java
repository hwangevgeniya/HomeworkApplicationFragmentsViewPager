package com.geektech.homeworkapplicationfragmentsviewpager.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.homeworkapplicationfragmentsviewpager.R;
import com.geektech.homeworkapplicationfragmentsviewpager.ui.Exchange;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private RecyclerView recyclerView;
    private RVAdapter rvAdapter;
    private ArrayList<Exchange> list = new ArrayList();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initRv(view);

    }

    private ArrayList<Exchange> createList() {

        list = new ArrayList();

        list.add((new Exchange(R.drawable.shape, "V-coin", "USD 1:00")));
        list.add((new Exchange(R.drawable.shapee, "B-coin", "USD 3:00")));
        list.add((new Exchange(R.drawable.shapeee, "S-coin", "USD 2:00")));
        return list;
    }

    private void initRv(View view) {
        recyclerView = view.findViewById(R.id.rv_exchange);
        rvAdapter = new RVAdapter();
        rvAdapter.setList(createList());
        recyclerView.setAdapter(rvAdapter);

    }
}