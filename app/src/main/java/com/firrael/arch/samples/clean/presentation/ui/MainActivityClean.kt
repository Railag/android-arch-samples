package com.firrael.arch.samples.clean.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.firrael.arch.samples.R
import com.firrael.arch.samples.clean.presentation.viewmodel.UserViewModel
import com.firrael.arch.samples.mvvm.MainViewModel

class MainActivityClean : AppCompatActivity() {

    private lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        viewModel.user.observe(this, {
            println("Clean user: $it")
        })

    }
}