package com.finepointmobile.rxjavaapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by danielmalone on 8/11/17.
 */

public interface EndpointsInterface {

    @GET("data/2.5/forecast?id=524901&APPID=4d33171b9b0ba97adf4b81aa48b0dd70")
    Call<com.finepointmobile.rxjavaapp.CurrentWeather> getCurrentWeather();
}
