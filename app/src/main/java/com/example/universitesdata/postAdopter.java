package com.example.universitesdata;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class postAdopter extends FirebaseRecyclerAdapter<PostModel, postAdopter.pastViewHolder>
{
    public postAdopter(@NonNull FirebaseRecyclerOptions<PostModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull pastViewHolder holder, int position, @NonNull PostModel model) {


        holder.name.setText(model.getName());
        holder.sector.setText(model.getSector());
        holder.city.setText(model.getCity());
        holder.adress.setText(model.getAdress());
        holder.other_details.setText(model.getOther_details());







    }

    @NonNull
    @Override
    public pastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new pastViewHolder(view);

    }

    class pastViewHolder extends RecyclerView.ViewHolder
    {


        TextView name,sector,city,adress,other_details;




        public pastViewHolder(@NonNull View itemView)

        {
            super(itemView);

            name = itemView.findViewById(R.id.university_name);
            sector = itemView.findViewById(R.id.sector);
            city = itemView.findViewById(R.id.city);
            adress=itemView.findViewById(R.id.adress);
        }
    }


}
