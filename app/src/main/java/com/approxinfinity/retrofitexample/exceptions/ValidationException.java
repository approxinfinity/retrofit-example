package com.approxinfinity.retrofitexample.exceptions;

import retrofit.RetrofitError;

public class ValidationException extends BaseException
{
     public ValidationException(RetrofitError error)
    {
        super(error);
    }

    public ValidationException()
    {
        super();
    }

}