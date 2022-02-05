package morales.gallego.trabajoandroid

import id.fahrulrazi.retrofitlatihan.PostModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/posts")
    fun getPosts() :Call<MutableList<PostModel>>
}