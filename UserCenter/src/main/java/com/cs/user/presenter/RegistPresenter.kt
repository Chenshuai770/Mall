package com.cs.user.presenter

import android.util.Log
import com.cs.base.ext.execute
import com.cs.base.presenter.BasePresenter
import com.cs.base.rx.BaseSubscriber
import com.cs.user.presenter.view.RegisterView
import io.reactivex.Observable
import java.util.concurrent.TimeUnit

/**
 *Create by Chenshuai
 *Date 2018/8/16 23:27
 *Descripton
 */
class RegistPresenter : BasePresenter<RegisterView>() {


    fun register(mobile: String, verifyCode: String, pwd: String): Unit {
        /*业务逻辑*/
       /* val userService = UserServiceIml()
        userService.regisiter(mobile, verifyCode, pwd)
                .execute(object : BaseSubscriber<Boolean>() {
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t, "")
                    }

                    override fun onError(e: Throwable) {
                        println(e.message)
                        // mView.onRegisterResult(false, e.message!!)
                    }
                })
*/
    }

    fun login( ): Unit {
        Observable.interval(1, TimeUnit.SECONDS)
                .execute(object : BaseSubscriber<Long>() {
                    override fun onNext(t: Long) {
                        Log.e("接受数据", t.toString())
                    }
                },activity)

    }

}

