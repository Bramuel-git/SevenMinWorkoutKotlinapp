package com.example.s7minworkouttrial

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.InternalCoroutinesApi

class MainActivity : AppCompatActivity() {



    @InternalCoroutinesApi
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.setIcon(R.drawable.ic_fitness)
        supportActionBar?.title = "      Fitness For All"

              var mediaController= android.widget.MediaController(this)

        var videoViewqq = videoViewqq
        videoViewqq.run {
          setMediaController(mediaController)
            setVideoPath("android.resource://"+packageName+"/"+R.raw.workout)
            start()
        }

        btnpause.setOnClickListener {
            videoViewqq.pause()


        }
        btnresume.setOnClickListener {
            onPause()
            videoViewqq.start()
        }
        btnrestart.setOnClickListener{
            videoViewqq.resume()
        }
        btn_end.setOnClickListener {
            videoViewqq.seekTo(8000000)
        }
        videoViewqq.setOnCompletionListener {
            val newIntent =Intent(this,CompleteActivity::class.java)
            startActivity(newIntent)

        }

    }
    @SuppressLint("ResourceType")
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_starttimer, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) { R.id.action_timer -> {
            val intent= Intent(this, TimerActivity::class .java)
            startActivity(intent)
            true

        }
            else -> super.onOptionsItemSelected(item)
        }
    }
}