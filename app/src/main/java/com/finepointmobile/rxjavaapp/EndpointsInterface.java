package com.finepointmobile.rxjavaapp;

import com.finepointmobile.rxjavaapp.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by danielmalone on 8/11/17.
 */

public interface EndpointsInterface {

    @GET("users")
    Call<List<User>> getAllUsers();
}
