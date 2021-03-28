package com.firrael.arch.samples.common

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.firrael.arch.samples.R
import com.firrael.arch.samples.clean.MainActivityClean
import com.firrael.arch.samples.databinding.SelectionActivityBinding
import com.firrael.arch.samples.mvi.MainActivityMvi
import com.firrael.arch.samples.mvp.MainActivityMvp
import com.firrael.arch.samples.mvvm.MainActivityMvvm

class SelectionActivity : AppCompatActivity() {

    private lateinit var binding: SelectionActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SelectionActivityBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        binding.mvpButton.setOnClickListener {
            val intent = Intent(this, MainActivityMvp::class.java)
            startActivity(intent)
        }

        binding.mvvmButton.setOnClickListener {
            val intent = Intent(this, MainActivityMvvm::class.java)
            startActivity(intent)
        }

        binding.mviButton.setOnClickListener {
            val intent = Intent(this, MainActivityMvi::class.java)
            startActivity(intent)
        }

        binding.cleanButton.setOnClickListener {
            val intent = Intent(this, MainActivityClean::class.java)
            startActivity(intent)
        }
    }
}