package com.example.rapidmove;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemReselectedListener navigation = new BottomNavigationView.OnNavigationItemReselectedListener() {
        @Override
        public void onNavigationItemReselected( MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()){
                case R.id.homes:
                    f = new homes();
                    break;
                case R.id.pesanan:
                    f = new pesanan();
                    break;
                case R.id.chat:
                    f = new chat();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,f).commit();
            return;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemReselectedListener(navigation);
    }
}