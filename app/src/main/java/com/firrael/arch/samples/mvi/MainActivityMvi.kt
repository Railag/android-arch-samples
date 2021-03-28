package com.firrael.arch.samples.mvi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.firrael.arch.samples.R
import com.firrael.arch.samples.mvvm.MainViewModel
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.collect
import moxy.MvpActivity

class MainActivityMvi : AppCompatActivity() {

    private lateinit var viewModel: MainViewModelMvi

    @InternalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        viewModel = ViewModelProvider(this).get(MainViewModelMvi::class.java)

        lifecycleScope.launchWhenCreated {
            viewModel.container.sideEffectFlow.collect { handleSideEffect(it) }
        }

        viewModel.printUser()
    }

    private fun handleSideEffect(sideEffect: UserSideEffect) {
        when (sideEffect) {
            is UserSideEffect.ConsoleMessage -> println(sideEffect.text)
        }
    }
}