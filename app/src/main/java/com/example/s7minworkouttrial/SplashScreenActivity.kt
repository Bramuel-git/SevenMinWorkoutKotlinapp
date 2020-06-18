package com.example.s7minworkouttrial

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var handler =Handler()
        handler.postDelayed({

       val newIntent =Intent(this,MainActivity::class.java)
         startActivity(newIntent)
          finish()

        },3000)
    }
}