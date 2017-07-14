package com.worldsrc.worldsrc.classes;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.worldsrc.worldsrc.R;

/**
 * Created by Amro on 14/07/2017.
 */

public class RecyclerMusicAdapter extends RecyclerView.Adapter<RecyclerMusicAdapter.ViewHolder> {

    private  String [] titles={"moview 1","moview 2"};
    private String [] details={"itme one","item 2"};
    private  int [] images={R.drawable.canada,R.drawable.borabora};

    @Override
    public RecyclerMusicAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardmusic_layout,parent,false);
        RecyclerMusicAdapter.ViewHolder viewHolder=new RecyclerMusicAdapter.ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerMusicAdapter.ViewHolder holder, int position) {
        holder.itemtitle.setText(titles[position]);
        holder.imageView.setImageResource(images[position]);

        holder.itemdetail.setText(details[position]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }


    class ViewHolder extends  RecyclerView.ViewHolder{
        public  int currentItem;
        public ImageView imageView;
        public TextView itemtitle;
        public TextView itemdetail;

        public  ViewHolder(View itemView)
        {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.item_image);
            itemtitle=(TextView)itemView.findViewById(R.id.item_title);
            itemdetail=(TextView)itemView.findViewById(R.id.item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position=getAdapterPosition();
                    Snackbar.make(v,"Cliecked detedcted item on "+position,Snackbar.LENGTH_SHORT).
                            setAction("Action",null).show();
                }
            });




        }



    }
}
