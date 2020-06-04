package com.example.mini_fill_recycerview_project;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityViewHolder> {

    List<City> cityList;
    Context context;


    public CityAdapter(List<City> cityList, Context context) {
        this.cityList = cityList;
        this.context = context;
    }

    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.city_list, parent, false);

        return new CityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, final int position) {
        City city = cityList.get(position);
        holder.txtcityname.setText(city.getCityname());
        holder.imgcity.setImageResource(city.getImgcity());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,Second_Activity.class);
                intent.putExtra("position",position);
                context.startActivity(intent);

               // Toast.makeText(context, position+"", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return cityList.size();
    }

    public class CityViewHolder extends RecyclerView.ViewHolder {
        TextView txtcityname;
        ImageView imgcity;
        CardView cardView;


        public CityViewHolder(@NonNull View itemView) {
            super(itemView);

            txtcityname = itemView.findViewById(R.id.txt_city);
            imgcity =  itemView.findViewById(R.id.img_city);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}
