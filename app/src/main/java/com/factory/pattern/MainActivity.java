package com.factory.pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FgtActivity.startActivity(MainActivity.this, FragmentID.FIRST_FRAGMENT);
            }
        });
        findViewById(R.id.btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FgtActivity.startActivity(MainActivity.this, FragmentID.SECOND_FRAGMENT);
            }
        });
        findViewById(R.id.btn_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("msg", "I form MainActivity");
                FgtActivity.startActivity(MainActivity.this, FragmentID.THIRD_FRAGMENT, bundle);
            }
        });
    }
}
