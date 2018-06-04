package com.marcinmejner.naukadaggerrxjavamvpmvvp.base;

import com.marcinmejner.naukadaggerrxjavamvpmvvp.data.RepoServiceModule;

import javax.inject.Singleton;

import dagger.Component;
import networking.ServiceModule;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        ActivityBindingModule.class,
        ServiceModule.class,
        RepoServiceModule.class
})
interface ApplicationComponent {


    void inject(MyApplication myApplication);
}
