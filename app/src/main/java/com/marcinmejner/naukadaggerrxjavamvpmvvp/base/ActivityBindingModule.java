package com.marcinmejner.naukadaggerrxjavamvpmvvp.base;


import android.app.Activity;

import com.marcinmejner.naukadaggerrxjavamvpmvvp.home.MainActivity;
import com.marcinmejner.naukadaggerrxjavamvpmvvp.home.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        MainActivityComponent.class,
})
public abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> provideMainActivityInjector(MainActivityComponent.Builder builder);

}
