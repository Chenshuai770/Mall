package com.cs.base.presenter

import com.cs.base.presenter.view.BaseView

open class BasePresenter<T:BaseView> {
    lateinit var mView:T
}