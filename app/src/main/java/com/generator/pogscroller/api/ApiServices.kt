package com.generator.pogscroller.api

import com.generator.pogscroller.model.Wordpress
import io.reactivex.Observable
import retrofit2.http.*

interface ApiServices {

    @Headers("api-version: 1.0")
    @GET("")
    fun getlatestPost(@Url url : String) : Observable<List<Wordpress.Result>>

}