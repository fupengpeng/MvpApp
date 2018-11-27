package com.st.c10.model.http.retrofit;


import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;

/**
 * TODO
 */
public interface BaseApi {

    Retrofit getRetrofit();

    OkHttpClient.Builder setInterceptor(Interceptor interceptor);

    Retrofit.Builder setConverterFactory(Converter.Factory factory);

}
