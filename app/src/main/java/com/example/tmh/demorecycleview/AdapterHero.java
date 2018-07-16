package com.example.tmh.demorecycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterHero extends RecyclerView.Adapter<AdapterHero.ViewHoder> {
    private ArrayList<Hero> mListHero;
    protected Context mContext;

    public AdapterHero(ArrayList<Hero> mListHero, Context mContext) {
        this.mListHero = mListHero;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHoder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recycleview, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {
        Hero mHero = mListHero.get(position);
        holder.mImageHero.setBackgroundResource(mHero.getImage());
        holder.mNameHero.setText(mHero.getName());
    }

    @Override
    public int getItemCount() {
        return mListHero.size();
    }


    public class ViewHoder extends RecyclerView.ViewHolder {
        ImageView mImageHero;
        TextView mNameHero;

        public ViewHoder(View itemView) {
            super(itemView);
            mImageHero = itemView.findViewById(R.id.image_itemView);
            mNameHero = itemView.findViewById(R.id.text_itemView);
        }
    }
}
