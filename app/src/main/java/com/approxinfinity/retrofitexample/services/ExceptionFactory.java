package com.approxinfinity.retrofitexample.services;

import com.approxinfinity.retrofitexample.exceptions.BaseException;
import com.approxinfinity.retrofitexample.exceptions.DataConversionException;
import com.approxinfinity.retrofitexample.exceptions.NetworkException;
import com.approxinfinity.retrofitexample.exceptions.NotFoundException;
import com.approxinfinity.retrofitexample.exceptions.UnauthorizedException;
import com.approxinfinity.retrofitexample.exceptions.UnknownException;
import com.approxinfinity.retrofitexample.exceptions.ValidationException;

import retrofit.RetrofitError;

public class ExceptionFactory
{
    public static BaseException getException(RetrofitError error)
    {
        switch (error.getKind())
        {
            case NETWORK:
                return new NetworkException();

            case CONVERSION:
                return new DataConversionException();

            case HTTP:

                if(error.getResponse() != null)
                {
                    switch (error.getResponse().getStatus())
                    {
                        case 401:
                            return new UnauthorizedException(error);

                        case 404:
                            return new NotFoundException();

                        case 412:
                            return new ValidationException(error);

                        default:
                            return new UnknownException(error);
                    }
                }
                else
                {
                    return new UnknownException(error);
                }
        }

        return new UnknownException(error);
    }

}