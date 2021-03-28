package com.firrael.arch.samples.clean

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.firrael.arch.samples.R
import moxy.MvpActivity

class MainActivityClean : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }
}