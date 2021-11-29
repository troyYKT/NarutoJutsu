package com.troy.narutojutsuapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;


public class JutsuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        TextView title = findViewById(R.id.titleTextView);
        TextView recipe = findViewById(R.id.jutsuTextView);
        ImageView imageView = findViewById(R.id.jutsuImageView);
        ImageView gifImageView = findViewById(R.id.gifImageView);



        Intent intent = getIntent();
        if (intent != null) {

            title.setText(intent.getStringExtra("title"));
            recipe.setText(intent.getStringExtra("body"));
            imageView.setImageResource(intent.getIntExtra("imageResource",0));


            String url = (String) intent.getStringExtra("imageUrl");

            Glide.with(this)
                    .asGif()
                    .load(url)
                    .into(gifImageView);

            Log.v("XCX","is"+ url);


        }
    }
}
