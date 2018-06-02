package com.marcinmejner.naukadaggerrxjavamvpmvvp.di;

import android.app.Activity;

public class Injector {

    public Injector() {
    }

    public static void inject(Activity activity) {
        ActivityInjector.get(activity).inject(activity);
    }

}
