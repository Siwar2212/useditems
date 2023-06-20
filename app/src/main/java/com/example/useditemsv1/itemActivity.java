package com.example.useditemsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class itemActivity extends AppCompatActivity {
    private ImageView firstImage, secImage, thirdImage;
    private TextView text; // image name
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        firstImage = findViewById(R.id.firstIV);
        secImage = findViewById(R.id.secIV);
        thirdImage = findViewById(R.id.thirdIV);
        text = findViewById(R.id.imageInfoTV);

        Intent intent = getIntent();
        if(intent.getStringExtra("name").equals("First Furniture")){
            firstImage.setVisibility(View.VISIBLE);
            secImage.setVisibility(View.GONE);
            thirdImage.setVisibility(View.GONE);
            text.setText("First Furniture");
        }else
            if(intent.getStringExtra("name").equals("Second Furniture")){
                secImage.setVisibility(View.VISIBLE);
                firstImage.setVisibility(View.GONE);
                thirdImage.setVisibility(View.GONE);
                text.setText("Second Furniture");
        }else
            if(intent.getStringExtra("name").equals("Third Furniture")){
                thirdImage.setVisibility(View.VISIBLE);
                firstImage.setVisibility(View.GONE);
                secImage.setVisibility(View.GONE);
                text.setText("Third Furniture");
             }



    }
}