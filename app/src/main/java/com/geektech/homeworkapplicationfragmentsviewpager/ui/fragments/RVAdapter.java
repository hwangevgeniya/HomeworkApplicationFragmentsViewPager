package com.geektech.homeworkapplicationfragmentsviewpager.ui.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.homeworkapplicationfragmentsviewpager.R;
import com.geektech.homeworkapplicationfragmentsviewpager.ui.Exchange;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {

    private ArrayList<Exchange> list = new ArrayList<>();

    public void setList(ArrayList<Exchange> list){
        this.list = list;
        notifyDataSetChanged();
    }


    @NonNull

    @Override
    public RVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_exchange, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView1, textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_exchange);
            textView1 = itemView.findViewById(R.id.tv_exchange);
            textView2 = itemView.findViewById(R.id.tv_usd);

        }

        public void onBind(Exchange exchange) {
            imageView.setImageResource(exchange.getImageExchange());
            textView1.setText(exchange.getNameExchange());
            textView2.setText(exchange.getUsdExchange());

        }
    }
}
