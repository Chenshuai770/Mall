package com.cs.base.ui.activity

import android.os.Bundle
import com.cs.base.injection.module.ActivityModule
import com.cs.base.presenter.BasePresenter
import com.cs.base.presenter.view.BaseView
import com.cs.base.wedgets.ProgressLoading


open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {



    lateinit var mPresenter: T

    lateinit var activityModule: ActivityModule

    private lateinit var mLoadingDialog:ProgressLoading

    override fun showLoading() {
        mLoadingDialog.showLoading()
    }

    override fun hideLoading() {
        mLoadingDialog.hideLoading()
    }

    override fun errow() {
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityModule = ActivityModule(this)
        mLoadingDialog= ProgressLoading.create(this)


    }




}