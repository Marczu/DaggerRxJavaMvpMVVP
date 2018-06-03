package networking;

import com.marcinmejner.naukadaggerrxjavamvpmvvp.model.AdapterFactory;
import com.marcinmejner.naukadaggerrxjavamvpmvvp.model.ZoneDateTimeAdapter;
import com.squareup.moshi.Moshi;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Call;
import retrofit2.Retrofit;


@Module
public abstract class ServiceModule {

    @Provides
    @Singleton
    static Moshi provideMoshi(){
        return new Moshi.Builder()
                .add(AdapterFactory.create())
                .add(new ZoneDateTimeAdapter())
                .build();
    }

    @Provides
    @Singleton
    static Retrofit provideRetrofit(Moshi moshi, Call.Factory callFactory, @Named("base_url") String baseUrl){
        return new Retrofit.Builder()
                .callFactory(callFactory)
                .addConverterFactory()

    }

}
