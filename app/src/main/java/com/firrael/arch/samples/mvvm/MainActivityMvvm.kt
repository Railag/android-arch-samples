package com.firrael.arch.samples.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.firrael.arch.samples.R

class MainActivityMvvm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragmentMvvm.newInstance())
                    .commitNow()
        }
    }
}