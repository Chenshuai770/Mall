package com.cs.user.presenter

import com.cs.base.presenter.BasePresenter
import com.cs.user.presenter.view.RegisterView

/**
 *Create by Chenshuai
 *Date 2018/8/16 23:27
 *Descripton
 */
class RegistPresenter : BasePresenter<RegisterView>() {
    fun register(mobile: String, verifyCode: String): Unit {
        /*业务逻辑*/
        mView.onRegisterResult(true)
    }
}