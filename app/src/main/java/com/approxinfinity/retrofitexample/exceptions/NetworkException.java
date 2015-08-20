package com.approxinfinity.retrofitexample.exceptions;

import retrofit.RetrofitError;

public class NetworkException extends BaseException
{

    public NetworkException(RetrofitError error)
    {
        super(error);
    }

    public NetworkException()
    {
        super();
    }

}
