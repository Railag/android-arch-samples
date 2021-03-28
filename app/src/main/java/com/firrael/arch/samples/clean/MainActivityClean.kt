package com.firrael.arch.samples.clean

import android.os.Bundle
import com.firrael.arch.samples.R
import moxy.MvpActivity

class MainActivityClean : MvpActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }
}