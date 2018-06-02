package com.marcinmejner.naukadaggerrxjavamvpmvvp.home;

import com.marcinmejner.naukadaggerrxjavamvpmvvp.di.ActivityScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@ActivityScope
@Subcomponent
public interface MainActivityComponent extends AndroidInjector<MainActivity>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {



    }

}
