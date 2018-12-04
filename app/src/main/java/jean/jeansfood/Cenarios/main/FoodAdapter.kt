package jean.jeansfood.Cenarios.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import jean.jeansfood.R
import jean.jeansfood.entidades.Food
import kotlinx.android.synthetic.main.food_item_lista.view.*

class FoodAdapter(val foods: List<Food>)
    : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_item_lista, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foods.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(foods[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(food: Food) {
            itemView.tvNome.text = food.strMeal
        }

    }
}