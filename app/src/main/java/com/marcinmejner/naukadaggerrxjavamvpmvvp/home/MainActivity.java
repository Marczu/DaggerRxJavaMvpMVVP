package com.marcinmejner.naukadaggerrxjavamvpmvvp.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bluelinelabs.conductor.Controller;
import com.marcinmejner.naukadaggerrxjavamvpmvvp.R;
import com.marcinmejner.naukadaggerrxjavamvpmvvp.base.BaseActivity;
import com.marcinmejner.naukadaggerrxjavamvpmvvp.trending.TrendingReposController;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected Controller initialScreen() {
        return new TrendingReposController();
    }
}
