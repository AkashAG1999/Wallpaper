package com.akash.wallpaper;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {

    private static Retrofit retrofit=null;
    public static final String API="563492ad6f9170000100000139e34d040a2c417eb14ae0c1abf170dd";


    public static ApiInterface getApiInterface()
    {
        if(retrofit==null)
        {
            retrofit=new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit.create(ApiInterface.class);
    }



}
