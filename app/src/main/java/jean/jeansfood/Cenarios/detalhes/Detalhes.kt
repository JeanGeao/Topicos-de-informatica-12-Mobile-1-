package jean.jeansfood.Cenarios.detalhes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jean.jeansfood.Glide.GlideApp
import jean.jeansfood.R
import jean.jeansfood.entidades.Food
import kotlinx.android.synthetic.main.activity_detalhes.*


class Detalhes : AppCompatActivity() {

    companion object {
        public const val FOOD: String = "Food"
        var food: Food?=null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        food = intent.getSerializableExtra(FOOD) as Food?
        if (food != null) {
            carregaDados()
        }

    }

    private fun carregaDados() {

            GlideApp.with(this)
                .load(food?.strMealThumb)
                .centerCrop()
                .into(strMealThumb)

            strMeal.text= food!!.strMeal
            strCategory.text= food!!.strCategory
            strInstructions.text= food!!.strInstructions
            strArea.text= food!!.strArea
            strYoutube.text= food!!.strYoutube


            //.toString() converte para string, caso usar o ID

    }
}
