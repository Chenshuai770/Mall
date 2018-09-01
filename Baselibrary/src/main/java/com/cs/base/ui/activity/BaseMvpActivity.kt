package com.cs.base.ui.activity

import android.os.Bundle
import com.cs.base.injection.module.ActivityModule
import com.cs.base.presenter.BasePresenter
import com.cs.base.presenter.view.BaseView


open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    override fun showLoading() {

    }

    override fun hideLoading() {
    }

    override fun errow() {
    }


    lateinit var mPresenter: T

    lateinit var activityModule: ActivityModule

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityModule = ActivityModule(this)
    }


}