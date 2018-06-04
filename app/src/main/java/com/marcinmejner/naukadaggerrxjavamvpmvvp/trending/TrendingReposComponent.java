package com.marcinmejner.naukadaggerrxjavamvpmvvp.trending;

import com.marcinmejner.naukadaggerrxjavamvpmvvp.di.ScreenScore;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@ScreenScore
@Subcomponent
public interface TrendingReposComponent extends AndroidInjector<TrendingReposController> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TrendingReposController> {

    }
}
