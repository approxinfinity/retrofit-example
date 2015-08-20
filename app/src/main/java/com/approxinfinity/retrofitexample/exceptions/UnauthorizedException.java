package com.approxinfinity.retrofitexample.exceptions;

import retrofit.RetrofitError;

public class UnauthorizedException extends BaseException
{

    public UnauthorizedException(RetrofitError error)
    {
        super(error);
    }

    public UnauthorizedException()
    {
        super();
    }

}
