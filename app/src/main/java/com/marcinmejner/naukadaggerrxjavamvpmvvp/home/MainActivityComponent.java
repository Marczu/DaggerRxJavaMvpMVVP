package com.marcinmejner.naukadaggerrxjavamvpmvvp.home;

import com.marcinmejner.naukadaggerrxjavamvpmvvp.di.ActivityScope;
import com.marcinmejner.naukadaggerrxjavamvpmvvp.ui.NavigationModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@ActivityScope
@Subcomponent(modules = {
        MainScreenBindingModule.class,
        NavigationModule.class,
})
public interface MainActivityComponent extends AndroidInjector<MainActivity>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {



    }

}
