package com.firrael.arch.samples.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.firrael.arch.samples.R
import com.firrael.arch.samples.common.User
import moxy.MvpActivity
import moxy.MvpView
import moxy.ktx.moxyPresenter

class MainActivityMvp : MvpActivity(), MainViewMvp {

    private val presenter by moxyPresenter { MainPresenter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

    override fun displayUser(user: User) {
        println("MVP user: $user")
    }
}