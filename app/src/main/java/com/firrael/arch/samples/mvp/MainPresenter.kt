package com.firrael.arch.samples.mvp

import com.firrael.arch.samples.common.testUser
import kotlinx.coroutines.launch
import moxy.InjectViewState
import moxy.MvpPresenter
import moxy.presenterScope

@InjectViewState
class MainPresenter : MvpPresenter<MainViewMvp>() {
    override fun onFirstViewAttach() {
        presenterScope.launch {
            viewState.displayUser(testUser());
        }
    }
}