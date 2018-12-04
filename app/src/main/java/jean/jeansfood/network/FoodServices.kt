package jean.jeansfood.network


import jean.jeansfood.entidades.FoodList
import retrofit2.Call
import retrofit2.http.GET

interface FoodServices {

    companion object {
        private const val API_KEY = "apiKey=1"
    }

    @GET("latest.php?$API_KEY")
    fun getMaisRescente() : Call<FoodList>

    @GET("random.php&$API_KEY")
    fun getAleatoria(): Call<FoodList>

}