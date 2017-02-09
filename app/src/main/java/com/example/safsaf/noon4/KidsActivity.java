package com.example.safsaf.noon4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class KidsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids);
        // IlliteracyActivity
        ImageView imageView7= (ImageView)findViewById(R.id.imageView7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent illiteracyIntent = new Intent(KidsActivity.this, IlliteracyActivity.class);
                startActivity(illiteracyIntent);


            }
        });

        // PrimaryActivity
        ImageView imageView5= (ImageView)findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent primaryIntent = new Intent(KidsActivity.this, PrimaryActivity.class);
                startActivity(primaryIntent);


            }
        });

// PrimaryActivity
        ImageView imageView6= (ImageView)findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent preIntent = new Intent(KidsActivity.this, PreActivity.class);
                startActivity(preIntent);


            }
        });

    }//  @Override protected void onCreate(Bundle savedInstanceState) {
}// public class KidsActivity extends AppCompatActivity {
