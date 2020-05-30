package com.example.trial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val background = object:Thread(){
            override fun run(){
                try{
                    Thread.sleep(1000)
                    val intent = Intent(baseContext,Admin::class.java)

                    startActivity(intent)
                    finish()
                }catch(e:Exception){
                    e.printStackTrace()
                }
            }
        }.start()
    }
}
