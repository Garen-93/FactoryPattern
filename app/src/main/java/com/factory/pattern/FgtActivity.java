package com.factory.pattern;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class FgtActivity extends AppCompatActivity {
    private FragmentManager fm;
    private FragmentTransaction ft;
    private int id;
    private Bundle bundle;

    public static void startActivity(Context context, int id) {
        Intent intent = new Intent();
        intent.setClass(context, FgtActivity.class);
        intent.putExtra("id", id);
        context.startActivity(intent);
    }

    public static void startActivity(Context context, int id, Bundle bundle) {
        Intent intent = new Intent();
        intent.setClass(context, FgtActivity.class);
        intent.putExtra("id", id);
        intent.putExtra("bundle", bundle);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fgt);
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        id = getIntent().getIntExtra("id", 0);
        bundle = getIntent().getBundleExtra("bundle");
        if (bundle == null) {
            ft.replace(R.id.fragment_content, FragmentFactory.createById(id));
        } else {
            ft.replace(R.id.fragment_content, FragmentFactory.createById(id, bundle));
        }
        ft.commit();
    }
}
