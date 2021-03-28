package com.firrael.arch.samples.mvp

import com.firrael.arch.samples.common.User
import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle


interface MainViewMvp : MvpView {

    @AddToEndSingle
    fun displayUser(user: User)
}

