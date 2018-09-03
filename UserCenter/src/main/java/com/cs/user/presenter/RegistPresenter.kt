package com.cs.user.presenter

import com.cs.base.ext.execute
import com.cs.base.presenter.BasePresenter
import com.cs.base.rx.BaseSubscriber
import com.cs.base.utils.NetWorkUtils
import com.cs.user.presenter.view.RegisterView
import com.cs.user.service.iml.UserServiceIml

/**
 *Create by Chenshuai
 *Date 2018/8/16 23:27
 *Descripton
 */
class RegistPresenter : BasePresenter<RegisterView>() {


    fun register(mobile: String, verifyCode: String, pwd: String): Unit {
        /*
        业务逻辑
        */
        if (!checkNetWork()){
            return
        }
        mView.showLoading()
        val userService = UserServiceIml()
        userService.regisiter(mobile, verifyCode, pwd)
                .execute(object : BaseSubscriber<Boolean>(mView) {
                    override fun onNext(t: Boolean) {
                        if (t){
                            mView.onRegisterResult("注册成功")
                            mView.hideLoading()
                        }

                    }

                }, mActivity)
    }

    /*fun login( ): Unit {
        Observable.interval(1, TimeUnit.SECONDS)
                .execute(object : BaseSubscriber<Long>() {
                    override fun onNext(t: Long) {
                        Log.e("接受数据", t.toString())
                    }
                },activity)

    }*/

}

