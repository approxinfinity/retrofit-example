package com.approxinfinity.retrofitexample.exceptions;

import retrofit.RetrofitError;

public class DataConversionException extends BaseException
{

    public DataConversionException(RetrofitError error)
    {
        super(error);
    }

    public DataConversionException()
    {
        super();
    }
}
