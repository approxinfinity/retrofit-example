package com.approxinfinity.retrofitexample.services;

import com.approxinfinity.retrofitexample.models.UserModel;
import com.approxinfinity.retrofitexample.providers.UserProvider;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class UserService
{
    public static void fetchUser(String id, final ICallback<UserModel> callback)
    {
        UserProvider provider = new UserProvider();
        provider.getUser(id, new Callback<UserModel>()
        {
            @Override
            public void success(UserModel user, Response response)
            {
                callback.success(user);
            }

            @Override
            public void failure(RetrofitError retrofitError)
            {
                callback.failure(ExceptionFactory.getException(retrofitError));
            }
        });
    }
}