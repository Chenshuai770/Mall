package com.cs.base.presenter

import android.arch.lifecycle.LifecycleObserver
import com.cs.base.presenter.view.BaseView
import com.cs.base.utils.NetWorkUtils

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity

open class BasePresenter<T : BaseView> : LifecycleObserver {
    lateinit var mView: T

    lateinit var mActivity: RxAppCompatActivity


    fun checkNetWork(): Boolean {
        return NetWorkUtils.isNetWorkAvailable(mActivity)
    }

}