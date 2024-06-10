package com.example.colorbaby;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{
    private ListView listView;
    String [] countryName;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);

        countryName = getResources().getStringArray(R.array.country_name);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textView1Id,countryName);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("name","GURU MONTRA");
                    startActivity(intent);
                }if(position==1){
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("name","SHIV MONTRA");
                    startActivity(intent);
                }if(position==0){
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("name","KRISHNA MONTRA");
                    startActivity(intent);
                }if(position==0){
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("name","RADHA MONTRA");
                    startActivity(intent);
                }if(position==0){
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("name","MOHA MONTRA");
                    startActivity(intent);
                }if(position==0){
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("name","LAXMI MONTRA");
                    startActivity(intent);
                }

            }
        });



           }


}