package com.example.no0ne.twoactivitiesexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private static String VALUE = "myValue 2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String value = getIntent().getExtras().getString(VALUE);

        Toast.makeText(this, value, Toast.LENGTH_LONG).show();
    }
}
