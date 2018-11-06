package com.websarva.wings.android.a11;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onHomeButtonClick(null);
    }

    public void onHomeButtonClick(View view) {
        setContentView(R.layout.activity_main);
    }

    public void onMenuButtonClick(View view) {
        setContentView(R.layout.activity_menu);
    }

    public void onCouponButtonClick(View view) {
        setContentView(R.layout.activity_coupon);
    }

    public void onEventButtonClick(View view) {

    }

    public void onSettingButtonClick(View view) {
        setContentView(R.layout.activity_setting);
    }

}
