package com.example.recyclerviewexample;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ImageViewHolder> {

    private int[] images;
    String n,p;
    String[] name,phone,date;
    private Context context;
    public RecyclerAdapter(int[] images,String[] name,String phone[],String[] date,Context context){
        this.images = images;
        this.name = name;
        this.phone = phone;
        this.date = date;
        this.context = context;
    }
    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contactlistlayout,parent,false);
        ImageViewHolder imageViewHolder = new ImageViewHolder(view,context,images);
        return imageViewHolder;
    }
    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        int image_id = images[position];
        holder.Album.setImageResource(image_id);
        holder.AlbumTitle.setText(name[position]);
        holder.phone.setText(phone[position]);
        holder.date.setText(date[position]);
    }
    @Override
    public int getItemCount() {
        return images.length;
    }
    public class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView Album;
        TextView AlbumTitle,date,phone;
        Context context;
        int[] images;
        public ImageViewHolder(@NonNull View itemView,Context context,int[] images) {
            super(itemView);
            Album = itemView.findViewById(R.id.album);
            AlbumTitle = itemView.findViewById(R.id.album_title);
            date = itemView.findViewById(R.id.date);
            phone = itemView.findViewById(R.id.phone);
            itemView.setOnClickListener(this);
            this.context =context;
            this.images = images;
        }

        @Override
        public void onClick(View v) {
            n=AlbumTitle.getText().toString();
            p=phone.getText().toString();
            Intent intent = new Intent(context, DetailsActivity.class);

            intent.putExtra("image_id",images[getAdapterPosition()]);
            intent.putExtra("name",String.valueOf(name[getPosition()]));
            intent.putExtra("phone",p);
            context.startActivity(intent);
        }
    }
}
