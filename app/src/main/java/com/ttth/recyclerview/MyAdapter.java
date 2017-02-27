package com.ttth.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Thanh Hang on 27/02/17.
 */

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private ArrayList<MyImage>arrImage;

    public MyAdapter(ArrayList<MyImage> arrImage) {
        this.arrImage = arrImage;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(new ItemImageView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MyImage image = arrImage.get(position);
        if (image == null)return;
        ((ItemImageView)holder.itemView).display(image);
    }

    @Override
    public int getItemCount() {
        return arrImage == null || arrImage.size() == 0 ? 0 : arrImage.size();
    }

     class MyViewHolder extends RecyclerView.ViewHolder {
        MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
