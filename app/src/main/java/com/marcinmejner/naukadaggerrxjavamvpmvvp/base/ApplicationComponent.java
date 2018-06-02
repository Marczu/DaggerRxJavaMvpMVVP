package com.marcinmejner.naukadaggerrxjavamvpmvvp.base;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        ActivityBindingModule.class
})
interface ApplicationComponent {


    void inject(MyApplication myApplication);
}
