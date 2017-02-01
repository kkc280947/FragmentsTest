package com.example.cbluser3.fragmentstest;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction=getSupportFragmentManager()
                .beginTransaction().add(R.id.flFrame,new FirstFragment(),"");
        fragmentTransaction.commit();


    }

    @Override
    public void onBackPressed() {

            super.onBackPressed();

    }
}
