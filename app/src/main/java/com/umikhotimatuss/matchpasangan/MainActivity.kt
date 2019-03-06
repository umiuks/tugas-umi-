package com.umikhotimatuss.matchpasangan

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            btnMatch.setOnContextClickListener { randomPasangan() }
        }
    }

    private fun randomPasangan(): Boolean {
        val randomCowok = Random().nextInt(3) + 1
        val randomCewek = Random().nextInt(3) + 1
        val drawableResCowok = when (randomCowok) {
            1 -> R.drawable.cowok1
            2 -> R.drawable.cowok2
            else -> R.drawable.cowok3
        }
        val drawableResCewek = when (randomCewek) {
            1 -> R.drawable.cewek1
            2 -> R.drawable.cewek2
            else -> R.drawable.cewek3
        }

        ivDadu1.setImageResource(drawableResCewek)
        ivDadu2.setImageResource(drawableResCowok)
        return false
    }

}