package pt.saphirex.sample.android.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pt.saphirex.sample.shared.Greeting
import android.widget.TextView
import pt.saphirex.sample.android.R
import pt.saphirex.sample.android.ui.user.home.UserHomeFragmentDirections

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        val homeDirection = UserHomeFragmentDirections.actionGlobalUserHomeFragment()
    }

}
