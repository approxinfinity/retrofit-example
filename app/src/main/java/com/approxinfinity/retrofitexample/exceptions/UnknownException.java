package com.approxinfinity.retrofitexample.exceptions;

import retrofit.RetrofitError;

public class UnknownException extends BaseException
{
    public UnknownException(RetrofitError error)
    {
        super(error);
    }

    public UnknownException()
    {
        super();
    }
}
