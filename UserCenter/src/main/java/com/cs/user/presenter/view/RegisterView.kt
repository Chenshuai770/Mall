package com.cs.user.presenter.view

import com.cs.base.presenter.view.BaseView

/**
 *Create by Chenshuai
 *Date 2018/8/17 0:13
 *Descripton
 */
interface RegisterView:BaseView{
    fun onRegisterResult(result: Boolean,msg:String)
}