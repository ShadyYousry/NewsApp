package com.newsapp.job.newsapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by shady on 3/10/2018.
 */

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    Context context;
    List<Items> data ;

    public RecycleViewAdapter(Context context, List<Items> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.each_item,parent,false);
        MyViewHolder myHolder = new MyViewHolder(view);

        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.title.setText(data.get(position).getTitle());
        holder.desc.setText(data.get(position).getDesc());
        holder.img.setImageResource(data.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView title , desc ;
        private ImageView img ;

        public MyViewHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.t_title);
            desc = (TextView) itemView.findViewById(R.id.t_decs);
            img = (ImageView) itemView.findViewById(R.id.im_item);

        }
    }
}
