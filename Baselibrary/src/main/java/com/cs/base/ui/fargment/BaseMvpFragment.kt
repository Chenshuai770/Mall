package com.cs.base.ui.fargment

import com.cs.base.injection.module.ActivityModule
import com.cs.base.presenter.BasePresenter
import com.cs.base.presenter.view.BaseView

/**
 *Create by Chenshuai
 *Date 2018/9/2 16:30
 *Descripton
 */
class BaseMvpFragment<T:BasePresenter<*>>:BaseFragment(),BaseView  {

    lateinit var mPresenter: T

    override fun showLoading() {

    }

    override fun hideLoading() {
    }

    override fun errow() {
    }
}