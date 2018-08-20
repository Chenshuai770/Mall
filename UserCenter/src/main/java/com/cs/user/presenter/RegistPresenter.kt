package com.cs.user.presenter

import com.cs.base.ext.execute
import com.cs.base.presenter.BasePresenter
import com.cs.base.rx.BaseSubscriber
import com.cs.user.presenter.view.RegisterView
import com.cs.user.service.iml.UserServiceIml
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 *Create by Chenshuai
 *Date 2018/8/16 23:27
 *Descripton
 */
class RegistPresenter : BasePresenter<RegisterView>() {
    fun register(mobile: String, verifyCode: String, pwd: String): Unit {
        /*业务逻辑*/
        val userService = UserServiceIml()
        userService.regisiter(mobile,verifyCode,pwd)
                .execute(object :BaseSubscriber<Boolean>(){
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t,"")
                    }

                    override fun onError(e: Throwable) {
                        println(e.message)
                       // mView.onRegisterResult(false, e.message!!)
                    }
                })

    }
}

