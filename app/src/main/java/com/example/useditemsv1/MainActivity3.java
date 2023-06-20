package com.example.useditemsv1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.appsearch.StorageInfo;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    private Button furnitureBTN, clothesBTN, carsBTN; // topics buttons
    private ImageView firstInfo, secInfo, thirdInfo; // furniture's info  _ for each item
    private ImageView firstImage, secImage, thirdImage // furniture's image item
    ,addIV , want1item, want2item, want3item ;
    private boolean notSelected1,notSelected2, notSelected3 ;
    private GridLayout furnitureGL;

    private DatabaseReference databaseReference;
    private StorageReference storageReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        notSelected1 = true;  // heart is not filled -> not selected
        notSelected2 = true;
        notSelected3 = true;


        furnitureBTN = findViewById(R.id.furnitureBtn);
//        clothesBTN = findViewById(R.id.clothesBtn);
//        carsBTN = findViewById(R.id.carsBtn);
        firstInfo = findViewById(R.id.firstInfo);
        firstImage = findViewById(R.id.firstIV);
        secInfo = findViewById(R.id.secInfo);
        secImage = findViewById(R.id.secIV);
        thirdInfo = findViewById(R.id.thirdInfo);
        thirdImage = findViewById(R.id.thirdIV);
        furnitureGL = findViewById(R.id.cardsLayout);

        want1item = findViewById(R.id.want1item);
        want2item = findViewById(R.id.want2item);
        want3item = findViewById(R.id.want3item);


        databaseReference = FirebaseDatabase.getInstance().getReference("Items" );
        storageReference = FirebaseStorage.getInstance().getReference("Items");



        //Example for one topic(furniture)  and one item(firstImage)
        furnitureBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                furnitureGL.setVisibility(View.VISIBLE);

            }
        });

        firstInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, itemActivity.class);
                intent.putExtra("image","firstImage");
                intent.putExtra("name","First Furniture");
                startActivity(intent);
            }
        });
        secInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, itemActivity.class);
                intent.putExtra("image","secImage");
                intent.putExtra("name","Second Furniture");
                startActivity(intent);
            }
        });
        thirdInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, itemActivity.class);
                intent.putExtra("image","thirdImage");
                intent.putExtra("name","Third Furniture");
                startActivity(intent);
            }
        });

        want1item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( notSelected1 ) {
                    want1item.setImageDrawable(getResources().getDrawable(R.drawable.favorite_icon));
                    notSelected1 = false;
                }else{
                    want1item.setImageDrawable(getResources().getDrawable(R.drawable.want_icon));
                    notSelected1 = true;
                }
            }
        });

        want2item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( notSelected2 ) {
                    want2item.setImageDrawable(getResources().getDrawable(R.drawable.favorite_icon));
                    notSelected2 = false;
                }else{
                    want2item.setImageDrawable(getResources().getDrawable(R.drawable.want_icon));
                    notSelected2 = true;
                }
            }
        });

        want3item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( notSelected3 ) {
                    want3item.setImageDrawable(getResources().getDrawable(R.drawable.favorite_icon));
                    notSelected3 = false;
                }else{
                    want3item.setImageDrawable(getResources().getDrawable(R.drawable.want_icon));
                    notSelected3 = true;
                }
            }
        });





    }

}