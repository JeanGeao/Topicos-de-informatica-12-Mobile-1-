package jean.jeansfood.Cenarios.main

import jean.jeansfood.entidades.Food

interface MainContract {

    interface  View {
        abstract fun showMessage(msg: String)
        abstract fun showList(food: List<Food>)
        fun showLoading()
        fun hideLoading()
        fun showDetails(food:Food)
    }

    interface Presenter{
        fun onLoadList()
        fun onLoadRandom()
    }
    
    
    
    
    
    
    
    
    
}