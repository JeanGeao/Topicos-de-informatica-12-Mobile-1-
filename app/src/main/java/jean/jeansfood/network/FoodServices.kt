package jean.jeansfood.network

import retrofit2.http.GET

interface FoodServices {

    companion object {
        private const val API_KEY = "apiKey=1"
    }

    @GET("latest.php$API_KEY")
    fun getMaisRescente()

    @GET("random.php&$API_KEY")
    fun getAleatoria()
}