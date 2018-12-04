package jean.jeansfood.Cenarios.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import jean.jeansfood.Glide.GlideApp
import jean.jeansfood.R
import jean.jeansfood.entidades.Food
import kotlinx.android.synthetic.main.food_item_lista.view.*

class FoodAdapter(val foods: List<Food>, val context: Context)
    : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_item_lista, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foods.size
    }

    //ele tem acesso aos atributos do adapter
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(foods[position], context)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(food: Food, context: Context) {
            itemView.tvNome.text = food.strMeal

            GlideApp.with(context)
                .load(food.strMealThumb)
                .centerCrop()
                .into(itemView.imgFood)
        }

    }
}