package com.cs.user.presenter.view

import com.cs.base.presenter.view.BaseView

/**
 * Created by ChenShuai on 2018/9/25/025.
 * 确定该activity是做什么的
 */
interface LoginView : BaseView {
    fun loginResult(result: String)
}