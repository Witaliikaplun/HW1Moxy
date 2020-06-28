package com.example.hw1moxy.recycler.view;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw1moxy.R;
import com.example.hw1moxy.recycler.presenter.IRecPresenter;
import com.example.hw1moxy.recycler.presenter.RecPresenter;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    public static final String DEBUG_LOG = "debug_log";
    ArrayList<Foto> list;
    IRecPresenter iRecPresenter;

    public Adapter(ArrayList<Foto> fotos, IRecPresenter iRecPresenter) {
        this.list = fotos;
        this.iRecPresenter = iRecPresenter;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(DEBUG_LOG, "нажали на- " + String.valueOf(getAdapterPosition()));
                    iRecPresenter.incCount();
                    Log.d(DEBUG_LOG, "колличество нажатий- " + iRecPresenter.getNumberCount());
                }
            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.items, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.img.setImageResource(list.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
