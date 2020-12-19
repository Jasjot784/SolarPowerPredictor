package com.jasjotsingh.solarpowerpredictor.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.jasjotsingh.solarpowerpredictor.R;
import com.jasjotsingh.solarpowerpredictor.data.About;

import java.util.ArrayList;

public class RecyclerAboutAdapter extends RecyclerView.Adapter<RecyclerAboutAdapter.ViewHolder> {
    Context mContext;
    ArrayList<About> mAboutArrayList;

    public RecyclerAboutAdapter(Context context, ArrayList<About> aboutArrayList) {
        this.mContext = context;
        this.mAboutArrayList = aboutArrayList;
    }

    @NonNull
    @Override
    public RecyclerAboutAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.about_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAboutAdapter.ViewHolder holder, int position) {
        About about = mAboutArrayList.get(position);
        holder.bindTo(about);
    }

    @Override
    public int getItemCount() {
        return mAboutArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView email;
        TextView info;
        ImageView imageResource;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            setIsRecyclable(false);
            title = itemView.findViewById(R.id.tvTitle);
            email = itemView.findViewById(R.id.tvEmail);
            info = itemView.findViewById(R.id.tvInfo);
            imageResource = itemView.findViewById(R.id.ivProfile);
        }

        public void bindTo(About about) {
            imageResource.setImageDrawable(null);
            title.setText(about.getTitle());
            info.setText(about.getInfo());
            email.setText(about.getEmail());
            Glide.with(mContext).load(about.getImageResource()).into(imageResource);
        }
    }
}
