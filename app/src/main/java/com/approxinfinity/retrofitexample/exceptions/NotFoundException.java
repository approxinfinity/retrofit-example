package com.approxinfinity.retrofitexample.exceptions;

import retrofit.RetrofitError;

public class NotFoundException extends BaseException
{

    public NotFoundException(RetrofitError error)
    {
        super(error);
    }

    public NotFoundException()
    {
        super();
    }

}
