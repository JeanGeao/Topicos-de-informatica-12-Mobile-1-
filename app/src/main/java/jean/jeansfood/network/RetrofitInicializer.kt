package jean.jeansfood.network

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitInicializer {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://www.themealdb.com/api/json/v1/1/")

        //converte o Json para um objeto em kotlin
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun createFoodServices() = retrofit.create(FoodServices::class.java)

}


