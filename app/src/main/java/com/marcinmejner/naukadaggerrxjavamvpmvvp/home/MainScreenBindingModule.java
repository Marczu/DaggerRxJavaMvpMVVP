package com.marcinmejner.naukadaggerrxjavamvpmvvp.home;

import com.bluelinelabs.conductor.Controller;
import com.marcinmejner.naukadaggerrxjavamvpmvvp.di.ControllerKey;
import com.marcinmejner.naukadaggerrxjavamvpmvvp.trending.TrendingReposComponent;
import com.marcinmejner.naukadaggerrxjavamvpmvvp.trending.TrendingReposController;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        TrendingReposComponent.class,
})
public abstract class MainScreenBindingModule {

    @Binds
    @IntoMap
    @ControllerKey(TrendingReposController.class)
    abstract AndroidInjector.Factory<? extends Controller> bindTrendingReposInjector(TrendingReposComponent.Builder builder);

}
