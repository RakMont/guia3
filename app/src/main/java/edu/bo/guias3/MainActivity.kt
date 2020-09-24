package edu.bo.guias3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnWhite.setOnClickListener {
            toast("White")
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }
        btnRed.setOnClickListener({
                _ -> toast("REd")
            layoutPrincipal.setBackgroundColor(Color.RED)
        })
    }
    private fun toast(text: String, duration: Int = Toast.LENGTH_LONG) =
        Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()
}


