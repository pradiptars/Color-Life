package com.example.colorbaby;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView imageView1, imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView1 = (ImageView) findViewById(R.id.imageView1Id);
        imageView2 = (ImageView) findViewById(R.id.imageView2Id);


        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){

            String countryName = bundle.getString("name");
            ShowDetails(countryNaAme);
        }

    }
    void ShowDetails(String countryName){

        if(countryName.equals("GURU MONTRA")){
            imageView1.setImageResource(R.drawable.guru);
            imageView2.setImageResource(R.drawable.gurutext);
        }
        if(countryName.equals("SHIV MONTRA")){
            imageView1.setImageResource(R.drawable.shiv);
            imageView2.setImageResource(R.drawable.shivtext);
        }
        if(countryName.equals("KRISHNA MONTRA")){
            imageView1.setImageResource(R.drawable.krishna);
            imageView2.setImageResource(R.drawable.krishnatext);
        }
        if(countryName.equals("RADHA MONTRA")){
            imageView1.setImageResource(R.drawable.radha);
            imageView2.setImageResource(R.drawable.radhatext);
        }
        if(countryName.equals("MOHA MONTRA")){
            imageView1.setImageResource(R.drawable.moha);
            imageView2.setImageResource(R.drawable.mohatext);
        }
        if(countryName.equals("LAXMI MONTRA")){
            imageView1.setImageResource(R.drawable.laxmi);
            imageView2.setImageResource(R.drawable.laxmitext);
        }

    }
}