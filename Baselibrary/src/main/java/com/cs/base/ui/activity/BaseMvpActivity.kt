package com.cs.base.ui.activity

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
}