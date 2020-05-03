package com.tilda.bottomnavigationapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private Fragment1 f1;
    private Fragment2 f2;
    private Fragment3 f3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = new Fragment1();
        f2 = new Fragment2();
        f3 = new Fragment3();

        //1.fragment görünecek
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, f1)
                .commit();


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.item1){
                    //1.fragment görünecek
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.frameLayout, f1)
                            .commit();
                }
                if(item.getItemId()==R.id.item2){
                    //2.fragment görünecek
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.frameLayout, f2)
                            .commit();
                }
                if(item.getItemId()==R.id.item3){
                    //3.fragment görünecek
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.frameLayout, f3)
                            .commit();
                }
                return true;
            }
        });
    }
}
