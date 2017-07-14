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
 * Created by Amro on 13/07/2017.
 */

public class RecyclerMovieAdapter extends RecyclerView.Adapter<RecyclerMovieAdapter.ViewHolder> {
private  String [] titles={"movie 1 movie 1","movie 2 movie 2 ","movie 3 movie 3 "};
    private String [] details={"1080P","720P","350P"};
    private String [] years={"2017","2016","2015"};
    private  int [] images={R.drawable.canada,R.drawable.borabora,R.drawable.india};

    @Override
    public RecyclerMovieAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardmovie_layout,parent,false);
        ViewHolder viewHolder=new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
holder.itemtitle.setText(titles[position]);
        holder.imageView.setImageResource(images[position]);

        holder.itemdetail.setText(details[position]);

        holder.itemYear.setText(years[position]);
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
        public TextView itemYear;

        public  ViewHolder(View itemView)
        {
        super(itemView);
             imageView=(ImageView)itemView.findViewById(R.id.item_image);
              itemtitle=(TextView)itemView.findViewById(R.id.item_title);
              itemdetail=(TextView)itemView.findViewById(R.id.item_detail);
            itemYear=(TextView)itemView.findViewById(R.id.item_year);

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
