package com.approxinfinity.retrofitexample.providers;

import com.approxinfinity.retrofitexample.models.UserModel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

public class UserProvider implements IRetrofitProvider
{

    @Override
    public IProvider getProvider()
    {
        retrofit.RestAdapter restAdapter = RestAdapter.getAdapter();
        return restAdapter.create(IProvider.class);
    }

    public void getUser(String id, Callback<UserModel> callback)
    {
        IProvider provider = getProvider();
        provider.getUser(id, callback);
    }

    private interface IProvider
    {
        @GET("/users/{id}")
        void getUser(
                @Path("id") String id,
                Callback<UserModel> callback);

    }
}
