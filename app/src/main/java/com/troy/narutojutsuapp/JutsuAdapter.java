package com.troy.narutojutsuapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JutsuAdapter extends RecyclerView.Adapter<JutsuAdapter.PizzaRecipeViewHolder> {

    ArrayList<JutsuItem> jutsuItems;
    Context context;

    public JutsuAdapter(ArrayList<JutsuItem> jutsuItems,
                        Context context) {
        this.jutsuItems = jutsuItems;
        this.context = context;
    }

    @NonNull
    @Override
    public JutsuAdapter.PizzaRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.jutsu_item,
                viewGroup, false);
        PizzaRecipeViewHolder pizzaRecipeViewHolder = new PizzaRecipeViewHolder(view);
        return pizzaRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaRecipeViewHolder viewHolder, int i) {
        JutsuItem jutsuItem = jutsuItems.get(i);


        viewHolder.title.setText(jutsuItem.getTitle());



    }

    @Override
    public int getItemCount() {
        return jutsuItems.size();
    }

    class PizzaRecipeViewHolder extends RecyclerView.ViewHolder implements
            View.OnClickListener {

        public TextView title;


        public PizzaRecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);


            title = itemView.findViewById(R.id.titleTextView);




        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            JutsuItem jutsuItem = jutsuItems.get(position);


            Intent intent = new Intent(context, JutsuActivity.class);
            intent.putExtra("imageResource", jutsuItem.getImageResource());
            intent.putExtra("gifResource", jutsuItem.getGifResource());
            intent.putExtra("title", jutsuItem.getTitle());
            intent.putExtra("body", jutsuItem.getBody());


            context.startActivity(intent);
        }
    }


}
