package com.approxinfinity.retrofitexample.exceptions;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import retrofit.RetrofitError;

public class BaseException extends Exception
{
    private String response;

    public BaseException(RetrofitError error)
    {
        try
        {
            if (error.getResponse() != null)
            {
                if (error.getResponse().getBody() != null)
                {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(error.getResponse().getBody().in()));

                    StringBuilder out = new StringBuilder();
                    String newLine = System.getProperty("line.separator");
                    String line;
                    while ((line = reader.readLine()) != null)
                    {
                        out.append(line);
                        out.append(newLine);
                    }

                    response = out.toString();
                }

            }
        }
        catch (IOException e)
        {
            Log.d("BaseException", "Error processing error message");
        }

    }

    public BaseException()
    {
    }

    // region getters/setters

    /*
     * If you need the body of the error response, it is available here
     */
    public String getResponse()
    {
        return response;
    }

    //endregion
}
