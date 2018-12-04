package jean.jeansfood.Cenarios.main

import jean.jeansfood.entidades.FoodList
import jean.jeansfood.network.RetrofitInicializer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter(val  view: MainContract.View) : MainContract.Presenter {

    override fun onLoadList(){
        val foodServices = RetrofitInicializer().createFoodServices()

         val call = foodServices.getMaisRescente()

        call.enqueue(object: Callback<FoodList> {
            override fun onFailure(call: Call<FoodList>, t: Throwable) {
                view.showMessage("Erro na conexão. Verifique sua conexão.")
            }

            override fun onResponse(call: Call<FoodList>, response: Response<FoodList>) {
                if (response.body() != null) {
                    view.showList(response.body()!!.Food)
                } else {
                    view.showMessage("não há comidas")
                }
            }
        })


    }
}