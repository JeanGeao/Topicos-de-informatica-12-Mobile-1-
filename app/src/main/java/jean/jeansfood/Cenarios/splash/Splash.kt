package jean.jeansfood.Cenarios.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import jean.jeansfood.Cenarios.main.MainActivity
import jean.jeansfood.Glide.GlideApp
import jean.jeansfood.R
import jean.jeansfood.entidades.FoodList
import kotlinx.android.synthetic.main.activity_splash.*

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        GlideApp.with (this)
            .load("https://cdn.dribbble.com/users/228367/screenshots/3783181/boil-boil-dribbble.gif")
            .centerCrop()
            .into(imgLoop)



        Handler().postDelayed({
            val FoodList = Intent(this, MainActivity::class.java)
            startActivity(FoodList)
            finish()
        },3000)

    }
}

