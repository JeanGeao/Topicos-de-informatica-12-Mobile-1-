package jean.jeansfood.Cenarios.main

import jean.jeansfood.entidades.Food

interface MainContract {

    interface  View {
        abstract fun showMessage(msg: String)
        abstract fun showList(food: List<Food>)

    }

    interface Presenter{
        fun onLoadList()
    }
    
    
    
    
    
    
    
    
    
}