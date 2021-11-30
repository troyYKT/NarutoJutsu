package com.troy.narutojutsuapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class JutsuAdapter extends RecyclerView.Adapter<JutsuAdapter.PizzaRecipeViewHolder> implements Filterable {

    ArrayList<JutsuItem> jutsuItems;
    ArrayList<JutsuItem> jutsuItemsFull;
    Context context;

    public JutsuAdapter(ArrayList<JutsuItem> jutsuItems,
                        Context context) {
        this.jutsuItems = jutsuItems;
        this.context = context;
        jutsuItemsFull = new ArrayList<>(jutsuItems);
    }


    @Override
    public JutsuAdapter.PizzaRecipeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.jutsu_item,
                viewGroup, false);
        PizzaRecipeViewHolder pizzaRecipeViewHolder = new PizzaRecipeViewHolder(view);
        return pizzaRecipeViewHolder;
    }


    @Override
    public int getItemCount() {
        return jutsuItems.size();
    }

    class PizzaRecipeViewHolder extends RecyclerView.ViewHolder implements
            View.OnClickListener {

        public TextView title;
        public ImageView thumbnail;


        public PizzaRecipeViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            thumbnail = itemView.findViewById(R.id.gifImageView);
            title = itemView.findViewById(R.id.titleTextView);




        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            JutsuItem jutsuItem = jutsuItems.get(position);


            Intent intent = new Intent(context, JutsuActivity.class);
            intent.putExtra("imageResource", jutsuItem.getImageResource());
            intent.putExtra("imageUrl", jutsuItem.getImageUrl());
            intent.putExtra("title", jutsuItem.getTitle());
            intent.putExtra("body", jutsuItem.getBody());


            context.startActivity(intent);
        }
    }
    @Override
    public void onBindViewHolder(PizzaRecipeViewHolder viewHolder, int i) {
        JutsuItem jutsuItem = jutsuItems.get(i);
        viewHolder.title.setText(jutsuItem.getTitle());
        String url = jutsuItem.getImageUrl();





    }

    @Override
    public Filter getFilter() {
        return JutsuFilter;
    }
    private Filter JutsuFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            ArrayList<JutsuItem> filteredList= new ArrayList<>();

            if (constraint == null || constraint.length()==0){
                filteredList.addAll(jutsuItemsFull);
            }else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (JutsuItem item: jutsuItemsFull){
                    if (item.getTitle().toLowerCase().contains(filterPattern)){
                        filteredList.add(item);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            jutsuItems.clear();
            jutsuItems.addAll((ArrayList) results.values);
            notifyDataSetChanged();

        }
    };

}