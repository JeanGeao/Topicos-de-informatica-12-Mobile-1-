package jean.jeansfood.Cenarios.splash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jean.jeansfood.Glide.GlideApp
import jean.jeansfood.R

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        GlideApp.with (this)
            .load("https://cdn.dribbble.com/users/228367/screenshots/3783181/boil-boil-dribbble.gif")
    }
}
