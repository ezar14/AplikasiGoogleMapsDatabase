package ac.id.atmaluhur.mahasiswa1911520009.api;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String URL = "http://192.168.43.110/File PHP and Mysql/";
    public static Retrofit RETROFIT = null;

    public static Retrofit getClient(){
        if (RETROFIT==null){
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor((Interceptor) new LoggingInterceptor())
                    .build();
            RETROFIT = new Retrofit.Builder()
                    .baseUrl(URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return RETROFIT;
    }
}
