package com.approxinfinity.retrofitexample.services;

public interface ICallback<T>
{
    void success(T model);
    void failure(Exception exception);
}