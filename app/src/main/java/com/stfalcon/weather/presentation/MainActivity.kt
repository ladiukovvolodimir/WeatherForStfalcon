package com.stfalcon.weather.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.stfalcon.weather.R
import com.stfalcon.weather.data.db.DatabaseHandler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        applicationContext?.let {
            DatabaseHandler.dbInitialize(it)
        }
    }
}