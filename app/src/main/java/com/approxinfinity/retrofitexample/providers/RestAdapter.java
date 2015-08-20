package com.approxinfinity.retrofitexample.providers;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.approxinfinity.retrofitexample.Constant;

import retrofit.RequestInterceptor;
import retrofit.converter.GsonConverter;

public class RestAdapter
{
    public static retrofit.RestAdapter getAdapter()
    {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                .create();

        return new retrofit.RestAdapter.Builder()
                .setConverter(new GsonConverter(gson))
                .setEndpoint(Constant.API_ROOT)
                .setLogLevel(Constant.RETROFIT_LOG_LEVEL)
                .setConverter(new GsonConverter(gson))
                .setRequestInterceptor(new RequestInterceptor()
                {
                    @Override
                    public void intercept(RequestFacade request)
                    {
                        request.addHeader("Accept", "application/json");
                    }
                })
                .build();
    }
}
