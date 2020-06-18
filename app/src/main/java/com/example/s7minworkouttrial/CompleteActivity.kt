package com.example.s7minworkouttrial

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_complete.*

class CompleteActivity: AppCompatActivity()  {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete)

        btn_goagain.setOnClickListener {

           onSupportNavigateUp()

 }
}
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

